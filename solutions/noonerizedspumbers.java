import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class noonerizedspumbers {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] math = br.readLine().split(" ");       
        
        long num1 = Long.parseLong(math[0]);
        long num2 = Long.parseLong(math[2]);
        long num3 = Long.parseLong(math[4]);
        
        String ans = "";
                
        // ADDITION
        if(math[1].equals("+")) {
            
            // Swapping 1 & 2
            for(int i = 1; i < math[0].length(); i++) {
                
                String num1Front = math[0].substring(0, i);
                String num1Back = math[0].substring(i);
                
                for(int j = 1; j < math[2].length(); j++) {
                    
                    String num2Front = math[2].substring(0, j);
                    String num2Back = math[2].substring(j);
                    
                    String str1 = num2Front + "" + num1Back;
                    String str2 = num1Front + "" + num2Back;
 
                    Long new1 = Long.parseLong(str1);
                    Long new2 = Long.parseLong(str2);
                    
                    if(new1 + new2 == num3) {
                        ans = str1 + " + " + str2 + " = " + math[4];
                    }
                }
                
                // Swapping 2 & 3
                if(ans.equals("")) {                    
                    for(int j = 1; j < math[4].length(); j++) {
                        
                        String num3Front = math[4].substring(0, j);
                        String num3Back = math[4].substring(j);
                        
                        String str1 = num3Front + "" + num1Back;
                        String str3 = num1Front + "" + num3Back;
                        
                        Long new1 = Long.parseLong(str1);
                        Long new3 = Long.parseLong(str3);
                        
                        if(new1 + num2 == new3) {
                            ans = str1 + " + " + math[2] + " = " + str3;
                        }               
                    }
                }
            }
            
            // Swapping 2 & 3
            if(ans.equals("")) {      
                for(int i = 1; i < math[2].length(); i++) {
                    
                    String num2Front = math[2].substring(0, i);
                    String num2Back = math[2].substring(i);
                    
                    for(int j = 1; j < math[4].length(); j++) {
                        
                        String num3Front = math[4].substring(0, j);
                        String num3Back = math[4].substring(j);
                        
                        String str2 = num3Front + "" + num2Back;
                        String str3 = num2Front + "" + num3Back;
     
                        Long new2 = Long.parseLong(str2);
                        Long new3 = Long.parseLong(str3);
                        
                        if(num1 + new2 == new3) {
                            ans = math[0] + " + " + str2 + " = " + str3;
                        }
                    }
                }
            }
        
        // MULTIPLICATION
        }else {
            
            // Swapping 1 & 2
            for(int i = 1; i < math[0].length(); i++) {

                String num1Front = math[0].substring(0, i);
                String num1Back = math[0].substring(i);
                
                for(int j = 1; j < math[2].length(); j++) {

                    String num2Front = math[2].substring(0, j);
                    String num2Back = math[2].substring(j);
                    
                    String str1 = num2Front + "" + num1Back;
                    String str2 = num1Front + "" + num2Back;
                                        
                    Long new1 = Long.parseLong(str1);
                    Long new2 = Long.parseLong(str2);
                    
                    if(new1 * new2 == num3) {
                        ans = str1 + " * " + str2 + " = " + math[4];
                    }
                }
                
                // Swapping 2 & 3
                if(ans.equals("")) {                    
                    for(int j = 1; j < math[4].length(); j++) {
                        
                        String num3Front = math[4].substring(0, j);
                        String num3Back = math[4].substring(j);
                        
                        String str1 = num3Front + "" + num1Back;
                        String str3 = num1Front + "" + num3Back;
                        
                        Long new1 = Long.parseLong(str1);
                        Long new3 = Long.parseLong(str3);
                        
                        if(new1 * num2 == new3) {
                            ans = str1 + " * " + math[2] + " = " + str3;
                        }               
                    }
                }
            }
            
            // Swapping 2 & 3
            if(ans.equals("")) {      
                for(int i = 1; i < math[2].length(); i++) {
                    
                    String num2Front = math[2].substring(0, i);
                    String num2Back = math[2].substring(i);
                    
                    for(int j = 1; j < math[4].length(); j++) {
                        
                        String num3Front = math[4].substring(0, j);
                        String num3Back = math[4].substring(j);
                        
                        String str2 = num3Front + "" + num2Back;
                        String str3 = num2Front + "" + num3Back;
     
                        Long new2 = Long.parseLong(str2);
                        Long new3 = Long.parseLong(str3);
                        
                        if(num1 * new2 == new3) {
                            ans = math[0] + " * " + str2 + " = " + str3;
                        }
                    }
                }
            }
        }
        
        // Output
        System.out.println(ans);
        
        br.close();
        
    }

}
