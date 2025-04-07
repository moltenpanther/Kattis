import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class danska {

    static final int alphabet = 26;
    static final int mod = 1000000007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] firstLine = br.readLine().split(" ");

        int length = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);

        List<String> forbidden = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            forbidden.add(br.readLine().trim());
        }

        System.out.println(countValidStrings(length, forbidden));
    }

    ///////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////

    static class Node {
        Node[] children = new Node[alphabet];
        Node fail;
        boolean isTerminal = false;
        int index;
    }

    static List<Node> nodes = new ArrayList<>();
    static int countValidStrings(int length, List<String> forbidden) {

        nodes.clear();
        Node root = buildAutomaton(forbidden);
        int numStates = nodes.size();

        int[][] dp = new int[length + 1][numStates];
        dp[0][root.index] = 1;

        for (int pos = 0; pos < length; pos++) {

            for (int state = 0; state < numStates; state++) {

                if (dp[pos][state] == 0) {
                    continue;
                } 

                Node node = nodes.get(state);
                for (int i = 0; i < alphabet; i++) {

                    Node next = node;
                    while (next.children[i] == null) {
                        next = next.fail;
                    }

                    next = next.children[i];
                    if (!next.isTerminal) {
                        dp[pos + 1][next.index] = (dp[pos + 1][next.index] + dp[pos][state]) % mod;
                    }

                }
            }
        }

        int result = 0;
        for (int state = 0; state < numStates; state++) {
            if (!nodes.get(state).isTerminal) {
                result = (result + dp[length][state]) % mod;
            }
        }
        return result;
    }

    static Node buildAutomaton(List<String> forbidden) {

        Node root = new Node();
        nodes.add(root);

        // Step 1: Builds the Trie
        for (String word : forbidden) {

            Node node = root;
            for (char ch : word.toCharArray()) {

                int index = ch - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Node();
                    nodes.add(node.children[index]);
                }
                
                node = node.children[index];
            }
            node.isTerminal = true;
        }

        // Step 2: Builds failure links with BFS
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < alphabet; i++) {
            if (root.children[i] != null) {
                root.children[i].fail = root;
                queue.add(root.children[i]);
            } else {
                root.children[i] = root;
            }
        }

        while (!queue.isEmpty()) {

            Node current = queue.poll();
            for (int i = 0; i < alphabet; i++) {

                Node child = current.children[i];
                if (child != null) {

                    Node fail = current.fail;
                    while (fail.children[i] == null) {
                        fail = fail.fail;
                    }

                    child.fail = fail.children[i];
                    child.isTerminal = child.isTerminal || child.fail.isTerminal;

                    queue.add(child);
                }

            }
        }

        // Assigns indices
        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).index = i;
        }

        return root;
    }
}
