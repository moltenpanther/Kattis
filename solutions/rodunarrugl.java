import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rodunarrugl {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        
        int[] targetPos = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            targetPos[i] = Integer.parseInt(line[i - 1]);
        }
        
        boolean[] visited = new boolean[num + 1];
        int moveCount = 0;
        
        // Finds cycles
        for (int i = 1; i <= num; i++) {
            if (!visited[i] && targetPos[i] != i) {
                int cycleLength = 0;
                int current = i;
                
                // Traverses a cycle
                while (!visited[current]) {
                    visited[current] = true;
                    current = targetPos[current];
                    cycleLength++;
                }
                
                // Adds moves
                if (cycleLength > 0) {
                    moveCount += cycleLength + 1;
                }
            }
        }
        
        System.out.println(moveCount);
        
        br.close();
    }
}
