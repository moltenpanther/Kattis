import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class dontbefake {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> starts = new LinkedList<Integer>();
        LinkedList<Integer> ends = new LinkedList<Integer>();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            for(int j = 1; j < line.length; j++) {

                int time = Integer.parseInt(line[j]);
                if(j % 2 != 0) {
                    starts.add(time);
                }else {
                    ends.add(time);
                }
            }
        }
        
        Collections.sort(starts);
        Collections.sort(ends);
        
        int count = 0;
        int maxCount = 0;
        
        int span = 0;
        int[] spans = new int[num + 1];
        
        while(starts.size() > 0 && ends.size() > 0) {
            
            // Retrieving the next time value
            int start = Integer.MAX_VALUE;
            if(starts.size() > 0) {
                start = starts.peek();
            }
            int end = ends.peek();
            
            // Tracking number of overlaps
            if(start <= end) {
                starts.remove();
                count++;
                
                if(count > maxCount) {
                    maxCount = count;
                    span = 0;
                }

            }else {
                ends.remove();
                count--;
            }
            
            if(count == maxCount) {
                span += (end - start) + 1;              
            }
            
        }
        // Output
        System.out.println(maxCount);
        System.out.println(span);
        
        br.close();
    }

}
