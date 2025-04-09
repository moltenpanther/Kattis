import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class dansgolf {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        int people = Integer.parseInt(line[2]);
        
        // Loop
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < people; i++) {
            
            line = br.readLine().split(" ");
            int row = Integer.parseInt(line[0]);
            int col = Integer.parseInt(line[1]);

            int diff = row - col;
            if(!set.contains(diff)) {
                set.add(diff);
            }            
        }

        // Output
        System.out.println(set.size());
        
        br.close();
    }

}
