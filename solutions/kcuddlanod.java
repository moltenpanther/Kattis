import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kcuddlanod {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        
        int num1 = reverseNum(line[0]);
        int num2 = reverseNum(line[1]);
        
        // Output
        if(num1 > num2) {
            System.out.println(1);
        }else {
            System.out.println(2);
        }
        
        br.close();
    }
    
    public static int reverseNum(String num) {
        
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            
            int dig = Integer.parseInt(num.substring(i, i + 1));
            if(dig == 2) {
                dig = 5;
            }else if(dig == 5) {
                dig = 2;
            }
            sum += dig * Math.pow(10, i);
        }
        return sum;
    }
    
}
