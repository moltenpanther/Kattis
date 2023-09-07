import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class overthehill1 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] matrix = new int[num][num];
        
        // Filling the matrix
        for(int i = 0; i < num; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < num; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        // Calculating padding
        char[] plainText = br.readLine().toCharArray();
        
        int padding = 0;
        if(plainText.length % num != 0) {
        	padding = num - (plainText.length % num);
        }
        
        // Letters to numbers
        int[] plainInt = new int[plainText.length + padding];
        for(int i = 0; i < plainText.length; i++) {
            char check = plainText[i];
            if(check > 64) {
                plainInt[i] = check - 65;
            }else if(check > 47) {
                plainInt[i] = check - 22;
            }else {
                plainInt[i] = 36;
            }
        }
                
        for(int i = plainText.length; i < plainInt.length; i++) {
            plainInt[i] = 36;
        }

        // Multiplying
        int[] code = new int[plainInt.length];
        for(int i = 0; i < plainText.length; i += num) {
            
            for(int j = i; j < i + num; j++) {
                
                int sum = 0;
                for(int k = 0; k < num; k++) {
                    sum += matrix[j % num][k] * plainInt[i + k];
                }
                code[j] = sum % 37;
                
            }
        }
        
        String ans = "";
        for(int i = 0; i < plainInt.length; i++) {
            int letter = code[i];
            if(letter < 26) {
                ans += (char)(letter + 65) + "";
            }else if(letter < 36) {
                ans += (letter - 26) + "";
            }else {
                ans += " ";
            }
        }
                
        // Output
        System.out.println(ans);
        
        br.close();
    }

}

