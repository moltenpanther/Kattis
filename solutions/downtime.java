import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class downtime {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int limit = Integer.parseInt(line[1]);
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        int count = 0;
        double max = -1;
        for(int i = 0; i < num; i++) {
            
            int time = Integer.parseInt(br.readLine());
            queue.add(time + 1000);

            while(time >= queue.peek()) {
                queue.remove();
                count--;
                
                if(queue.isEmpty()) {
                    break;
                }
            }
            
            if(time < queue.peek()) {
                count++;
                if(count >  max) {
                    max = count;
                }
            }
        }
        
        int ans = (int)Math.ceil(max / limit);
        
        // Output
        System.out.println(ans);
        
        br.close();
    }

}
