import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class speedrunning {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String line = br.readLine();
        
        Stack<Integer> saws = new Stack<Integer>();     
        int count = 0;
        for(int i = num - 1; i > 0; i--) {
            
            char ch = line.charAt(i);
            if(ch == 'S') {
                saws.add(i);
                if(saws.size() == 3) {
                    count = -1;
                    break;
                }
            }else if(ch == '?') {
                if(!saws.isEmpty()) {
                    saws.pop();
                }
            }
            
            if(!saws.isEmpty()) {
                count += 2;
            }else {
                count++;
            }
            
        }

        // Output
        System.out.println(count);
        
        br.close();
    }

}
