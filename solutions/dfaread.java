import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class dfaread {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int c = Integer.parseInt(line[1]);
        int s = Integer.parseInt(line[2]);
        int f = Integer.parseInt(line[3]);

        String[] alphabet = br.readLine().split("");
        Map<Character, Integer> charToIndex = new HashMap<>();
        for (int i = 0; i < c; i++) {
            charToIndex.put(alphabet[i].charAt(0), i);
        }

        Set<Integer> finals = new HashSet<>();
        String[] finalStates = br.readLine().split(" ");
        if (f > 0) {
            for (String fs : finalStates) {
                finals.add(Integer.parseInt(fs));
            }
        }

        int[][] transitions = new int[n + 1][c];
        for (int i = 1; i <= n; i++) {
            line = br.readLine().split(" ");
            for (int j = 0; j < c; j++) {
                transitions[i][j] = Integer.parseInt(line[j]);
            }
        }

        // DFA!
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {

            String str = br.readLine();

            int curr = s;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                int index = charToIndex.get(ch);
                curr = transitions[curr][index];
            }

            // Output
            if (finals.contains(curr)) {
                System.out.println("accept");
            } else {
                System.out.println("reject");
            }
        }
                    
        br.close();
    }

}
