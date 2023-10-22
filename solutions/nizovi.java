import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nizovi {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
   //   String line = "{a,b,{c,d},e,{}}";
   //   String line = "{{{}}}";
        StringBuilder sb = new StringBuilder(line.length());
        
        int tabs = 0;
        char prev = ' ';
        for(int i = 0; i < line.length(); i++) {
            
            char ch = line.charAt(i);
                        
            if(ch == '{') {
                
                tabs++;
                
                sb.append(ch);
                sb.append("\n");
                
                if(i + 1 < line.length()) {
                    char next = line.charAt(i + 1);
                    if(next == '}') {
                        for(int j = 0; j < tabs - 1; j++) {
                            sb.append("  ");                    
                        }
                    }else {             
                        for(int j = 0; j < tabs; j++) {
                            sb.append("  ");                    
                        }
                    }
                }
                
            }else if(ch == ',') {
                
                sb.append(ch);
                sb.append("\n");
                for(int j = 0; j < tabs; j++) {
                    sb.append("  ");                    
                }
                
            }else if(ch == '}') {
                
                tabs--;
                if(prev == '{') {
                    
                    sb.append(ch);
                    
                }else {
                    sb.append("\n");
                    for(int j = 0; j < tabs; j++) {
                        sb.append("  ");                    
                    }
                    sb.append(ch);                  
                }
                
                if(i + 1 < line.length()) {
                    char next = line.charAt(i + 1);
                    if(next == '{') {
                        sb.append("\n");
                    }
                }
            
            }else {
                sb.append(ch);              
            }
            
            
            prev = ch;
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}

