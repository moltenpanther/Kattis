import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arithmetic {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] oct2bin = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String[] bin2hex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        StringBuilder sb = new StringBuilder();
        StringBuilder sbbin = new StringBuilder();
        
        String oct = br.readLine();
        
        if(oct.length() < 2) {
            System.out.println(oct);
            System.exit(0);
        }
        // Add leading zeros
        int rem = (oct.length() * 3) % 4;
        rem = 4 - rem;
        while(rem-- > 0) {
            sb.append(0);
        }
        
        // Converting to binary
        for(int i = 0; i < oct.length(); i++) {
            
            int octDig = Integer.parseInt(oct.substring(i, i + 1));
            sb.append(oct2bin[octDig]);
            
            while(sb.length() % 4 == 0 && sb.length() > 0) {
                String binStr = sb.substring(0, 4);
                int bin = Integer.parseInt(binStr, 2);
                
                sb.delete(0, 4);
                sbbin.append(bin2hex[bin]);
            }
        }
        
        while(sb.length() % 4 == 0 && sb.length() > 0) {
            String binStr = sb.substring(0, 4);
            int bin = Integer.parseInt(binStr, 2);
            
            sb.delete(0, 4);
            sbbin.append(bin2hex[bin]);
        }
        
        // Output
        for(int i = 0; i < sbbin.length(); i++) {
            if(sbbin.charAt(i) != '0') {
                System.out.println(sbbin.substring(i));
                System.exit(0);
            }
        }
        
        br.close();
    }

}
