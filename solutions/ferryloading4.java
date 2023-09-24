import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ferryloading4 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            int length = Integer.parseInt(line[0]) * 100;
            int cars = Integer.parseInt(line[1]);
            
            Queue<Integer> left = new LinkedList<Integer>();
            Queue<Integer> right = new LinkedList<Integer>();
            
            // Filling the queues
            for(int j = 0; j < cars; j++) {
                
                String[] carLine = br.readLine().split(" ");
                int car = Integer.parseInt(carLine[0]);
                String dir = carLine[1];
                
                if(dir.charAt(0) == 'l') {
                    left.add(car);
                }else {
                    right.add(car);
                }
                
            }
            
            int count = 0;
            while(!left.isEmpty() || !right.isEmpty()) {
                
                int load = 0;
                while(!left.isEmpty()) {
                    if(load + left.peek() <= length) {
                        load += left.remove();
                    }else {
                        break;
                    }
                }
                
                if(load > 0 || !right.isEmpty()) {
                    count++;
                }
                
                load = 0;
                while(!right.isEmpty()) {
                    if(load + right.peek() <= length) {
                        load += right.remove();
                    }else {
                        break;
                    }
                }
                
                if(load > 0 || !left.isEmpty()) {
                    count++;
                }
            }
            
            System.out.println(count);
            
        }
        
        // Output
        System.out.println("");
        
        br.close();
    }

}

