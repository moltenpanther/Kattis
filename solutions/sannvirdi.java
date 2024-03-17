import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

public class sannvirdi {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
        
        // Filling tree
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < num; i++) {
            String[] line = br.readLine().split(" ");
            String name = line[0];
            int guess = Integer.parseInt(line[1]);
            
            tree.put(guess, name);
            
            if(guess < min) {
                min = guess;
            }
        }
        
        int ideas = Integer.parseInt(br.readLine());
        for(int i = 0; i < ideas; i++) {
            
            int idea = Integer.parseInt(br.readLine());
            if(idea < min) {
                sb.append(":(");
                sb.append("\n");
            }else {
                String name = tree.floorEntry(idea).getValue();
                sb.append(name);
                sb.append("\n");
            }
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
