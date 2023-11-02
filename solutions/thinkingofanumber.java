import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class thinkingofanumber {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = 0;
        while((num = Integer.parseInt(br.readLine())) != 0) {
            
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;                        
            LinkedList<Integer> divs = new LinkedList<Integer>();
            
            for(int i = 0; i < num; i++) {
                
                String[] command = br.readLine().split(" ");
                char ch = command[0].charAt(0);
                                
                int val = Integer.parseInt(command[2]);
                if(ch == 'l' && val < max) {
                    max = val;
                }else if(ch == 'g' && val > min) {
                    min = val;
                }else if(ch == 'd'){
                    divs.add(val);
                }
                
            }

            if(max > 50000) {
                sb.append("infinite");
            }else {         
                
                if(min < 0) {
                    min = 0;
                }
                
                boolean added = false;
                for(int i = min + 1; i < max; i++) {
                    boolean good = true;
                    for(int j = 0; j < divs.size(); j++) {
                        if(i % divs.get(j) != 0) {
                            good = false;
                            j = divs.size();
                        }
                    }
                    
                    if(good) {
                        sb.append(i);
                        sb.append(" ");
                        added = true;
                    }
                    
                }
                
                if(!added) {
                    sb.append("none");
                }
                
            }
            
            sb.append("\n");
        }

        // Output
        System.out.println(sb);         
        
        br.close();
    }

}
