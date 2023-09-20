import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class slystudents {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] message = br.readLine().split(" ");
        for(int i = 0; i < message.length; i++) {
            
            // Turns a word into its ASCII values
            String word = message[i];
            
            int[] ascii = new int[word.length()];
            for(int j = 0; j < word.length(); j++) {
                ascii[j] = word.charAt(j);
            }
            
            // Finds GCD
            int gcd = findGCD(ascii);
            System.out.println(gcd);
            for(int j = 0; j < ascii.length; j++) {
                ascii[j] /= gcd;
            }
            
            // Converts to base 3
            for(int j = 0; j < ascii.length; j++) {
                
                int three = 0;
                int dec = ascii[j];
                for(int k = 4; k >= 0; k--) {
                    
                    three *= 10;                    
                    int multi = (int) Math.pow(3,  k);
                    
                    int count = 0;
                    while(dec >= multi) {
                        dec -= multi;
                        count++;
                    }
                    
                    three += count;
                    
                }
                System.out.print(three + " ");
            }
            
            System.out.println();
            
        }
        
        
        
        
        // Output
        System.out.println("");
        
        br.close();
        
    }
    
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;           
        }
        
        return gcd(b % a, a);
    }
  
    public static int findGCD(int nums[]) {
                
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            
            int num = nums[i];
            
            ans = gcd(ans, num);
  
            if(ans == 1) {
               return 1;
            }
        }
  
        return ans;
    }

}

