import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class scrollingsign {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] nums = br.readLine().split(" ");
            
            int len = Integer.parseInt(nums[0]);
            int wordNum = Integer.parseInt(nums[1]);
                        
            String[] words = new String[wordNum];
            for(int j = 0; j < wordNum; j++) {
                words[j] = br.readLine();   
            }
            
            String str1 = "";
            String str2 = "";
            
            StringBuilder sb = new StringBuilder();
            sb.append(words[0]);
            for(int j = 0; j < wordNum - 1; j++) {
                
                str1 = words[j];
                str2 = words[j + 1];
                            
                boolean match = false;
                int k = str1.length() - len;
                while(k < len) {
                    
                    String sub1 = str1.substring(k, len);
                    String sub2 = str2.substring(0, len - k);

                    if(sub1.equals(sub2)) {
                        sb.append(str2.substring(len - k, len));

                        match = true;
                        k = len;
                    }
                    
                    k++;
                    
                }
                
                if(!match) {
                    sb.append(str2);
                }
                
                str1 = sb.toString();                   

            }
            
            // Output
            String ans = sb.toString();
            System.out.println(ans.length());
            
        }
        
        br.close();
    }

}

