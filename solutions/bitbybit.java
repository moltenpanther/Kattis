import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bitbybit {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        while(num != 0) {
            
            char[] binary = {'?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?', '?'};
            
            for(int i = 0; i < num; i++) {
                
                String[] line = br.readLine().split(" ");
                char cmd = line[0].charAt(0);
                
                // Set
                if(cmd == 'S') {
                    int index = Integer.parseInt(line[1]);
                    binary[index] = '1';
                    
                // Clear
                }else if(cmd == 'C') {
                    int index = Integer.parseInt(line[1]);
                    binary[index] = '0';
                    
                // And
                }else if(cmd == 'A') {
                    int index1 = Integer.parseInt(line[1]);
                    int index2 = Integer.parseInt(line[2]);
                    
                    int bin1 = binary[index1];
                    int bin2 = binary[index2];
                    
                    if(bin1 == '0' || bin2 == '0') {                    
                        binary[index1] = '0';
                    }else if(bin1 == '?' || bin2 == '?') {                  
                        binary[index1] = '?';
                    }else {
                        binary[index1] = '1';
                    }
                    
                // Or
                }else if(cmd == 'O') {
                    int index1 = Integer.parseInt(line[1]);
                    int index2 = Integer.parseInt(line[2]);
                    
                    int bin1 = binary[index1];
                    int bin2 = binary[index2];
                    
                    if(bin1 == '1' || bin2 == '1') {
                        binary[index1] = '1';
                    }else if(bin1 == '?' || bin2 == '?') {
                        binary[index1] = '?';
                    }else {
                        binary[index1] = '0';
                    }
                }
            }
        
            // Output
            for(int i = binary.length - 1; i >= 0; i--) {
                sb.append(binary[i]);
            }
            sb.append("\n");
            
            num = Integer.parseInt(br.readLine());
        }
        
        System.out.print(sb);
        br.close();
    }

}
