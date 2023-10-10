import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class brokenswords {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        
        int tb = 0;
        int lr = 0;
        
        for(int i = 0; i < num; i++) {
            
            String sword = br.readLine();
            if(sword.charAt(0) == '0') {
                tb++;
            }
            if(sword.charAt(1) == '0') {
                tb++;
            }
            if(sword.charAt(2) == '0') {
                lr++;
            }
            if(sword.charAt(3) == '0') {
                lr++;
            }
        }
        
        int count = 0;
        while(tb - 2 >= 0 && lr - 2 >= 0) {
            tb -= 2;
            lr -= 2;
            count++;
        }
        
        // Output
        System.out.println(count + " " + tb + " " + lr);
        
        br.close();
    }

}

