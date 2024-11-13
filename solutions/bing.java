import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class bing {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        TrieNode root = new TrieNode();
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            
            String prefix = br.readLine();
            insert(root, prefix);
            
            int count = search(root, prefix);
            sb.append(count).append("\n");
        }

        // Output
        System.out.print(sb);

        br.close();
    }

    static void insert(TrieNode root, String word) {
        
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
            node.count++;
        }
    }

    static int search(TrieNode root, String prefix) {
        
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return 0;
            }
            node = node.children.get(ch);
        }
        
        return node.count - 1;
    }
}

class TrieNode {
    HashMap<Character, TrieNode> children;
    int count;

    TrieNode() {
        children = new HashMap<>();
        count = 0;
    }
}
