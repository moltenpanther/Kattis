import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class addingwords {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Hashtable<String, Integer> vars = new Hashtable<String, Integer>();
        Hashtable<Integer, String> revVars = new Hashtable<Integer, String>();
        
        String inp = "";
        while((inp = br.readLine()) != null) {
            
            String[] line = inp.split(" ");
            String command = line[0];
            
            // Resets all values
            if(command.equals("clear")) {
                vars = new Hashtable<String, Integer>();
                revVars = new Hashtable<Integer, String>();
            
                // Defines a variable
            }else if(command.equals("def")) {
                    String word = line[1];
                    int num = Integer.parseInt(line[2]);
                    
                    if(vars.containsKey(word)) {
                        int keyVal = vars.put(word, num);
                        revVars.remove(keyVal);
                    }
            
                    vars.put(word, num);
                    revVars.put(num, word);
                    
            // Calculates
            }else {
                
                int total = 0;

                boolean neg = false;
                boolean unknown = false;
                for(int i = 1; i < line.length; i += 2) {
                    
                    String word = line[i];
                    char sign = line[i + 1].charAt(0);
                    
                    if(!vars.containsKey(word)) {
                        unknown = true;
                        i = line.length;
                    }else {
                        int num = vars.get(word);
                        if(neg) {
                            num *= -1;
                        }
                        total += num;
                        
                        // Changing sign for next word
                        if(sign == '-') {
                            neg = true;                         
                        }else {
                            neg = false;
                        }
                    }
                    
                }
                
                // Outputs calculation
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i < line.length; i++) {
                    sb.append(line[i] + " ");
                }

                if(!revVars.containsKey(total) || unknown) {
                    sb.append("unknown");
                }else {
                    String ans = revVars.get(total);
                    sb.append(ans);
                }
                
                System.out.println(sb);
            }
            
        }

        br.close();
    }

}
