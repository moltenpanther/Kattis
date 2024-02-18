import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class asciifigurerotation {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int rows = Integer.parseInt(br.readLine());
        while(rows != 0) {
            
            // Reading input
            int cols = -1;
            String[] shape = new String[rows];
            for(int i = 0; i < rows; i++) {
                shape[i] = br.readLine();
                if(shape[i].length() > cols) {
                    cols = shape[i].length();
                }
            }
            
            // Rotating
            for(int j = 0; j < cols; j++) {
                StringBuilder sb2 = new StringBuilder();
                for(int i = rows - 1; i >= 0; i--) {
                    
                    char ch = ' ';
                    String line = shape[i];
                    if(j < line.length()) {
                        ch = shape[i].charAt(j);
                        if(ch == '|') {
                            ch = '-';
                        }else if(ch == '-') {
                            ch = '|';
                        }
                        
                    }
                    sb2.append(ch);
                }
                String row = sb2.toString().stripTrailing();
                sb.append(row);
                sb.append("\n");
            }
            rows = Integer.parseInt(br.readLine());
            sb.append("\n");
        }
       
        // Output
        System.out.print(sb.substring(0, sb.length() - 1));
        
        br.close();
    }

}
