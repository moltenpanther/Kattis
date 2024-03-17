import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ullendullendoff2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        String target = br.readLine();
        
        Stack<String> names = new Stack<String>();
        for(int i = 1; i < num; i++) {
            String name = br.readLine();
            names.add(name);
        }
        
        int pos = 12;
        if(num <= 12) {
            pos = 12 % num;
            pos %= 12;
        }
        
        // Building the name list
        for(int i = 0; i < num; i++) {
            if(i == pos) {
                sb.append(target);
            }else {
                sb.append(names.pop());
            }
            sb.append("\n");
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
