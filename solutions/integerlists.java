import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class integerlists {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            // Getting input
            String commands = br.readLine();
            int len = Integer.parseInt(br.readLine());
            
            String inp = br.readLine();
            String[] list = inp.substring(1, inp.length() - 1).split(",");
            
            boolean start = true;
            int indexS = 0;
            int indexE = len - 1;
            
            // Processing commands
            int countD = 0;
            for(int j = 0; j < commands.length(); j++) {
                
                char com = commands.charAt(j);
                if(com == 'R') {
                    start = !start;
                }else if(com == 'D'){
                    if(start) {
                        indexS++;
                    }else {
                        indexE--;
                    }
                    countD++;
                }
                
            }
            
            if(countD > len) {
                sb.append("error\n");
            }else {             
                
                // Printing output
                sb.append("[");
                if(!start) {
                    for(int j = indexE; j >= indexS; j--) {
                        sb.append(list[j]);
                        if(j != indexS) {
                            sb.append(",");
                        }
                    }                   
                }else {             
                    for(int j = indexS; j <= indexE; j++) {
                        sb.append(list[j]);
                        if(j != indexE) {
                            sb.append(",");
                        }
                    }
                }
                sb.append("]\n");
            }
            
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
