import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Stack;

public class quickscope {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // <varName, Stack<[dtypes, layer]>>  (for long-term tracking)
        Hashtable<String, Stack<String[]>> hash = new Hashtable<String, Stack<String[]>>();
        // LinkedList index is layer, Stack is varNames in layer
        LinkedList<Stack<String>> layerVariables = new LinkedList<Stack<String>>();
        
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
        int layer = 0;
        layerVariables.add(new Stack<String>());

        for(int i = 0; i < num; i++) {
            
            String inp = br.readLine();
            String[] line = inp.split(" ");
            char command = line[0].charAt(0);
                        
            // Query of a variable's datatype
            if(command == 'T') {
                
                String var = line[1];
                if(!hash.containsKey(var)) {
                    sb.append("UNDECLARED\n");
                }else {
                    String dtype = hash.get(var).peek()[0];
                    sb.append(dtype + "\n");
                }
                
            // Declare a variable's datatype
            }else if(command == 'D') {
                
                String var = line[1];
                String datatype = line[2];
                
                if(hash.containsKey(var)) { 
                    
                    int dataLayer = Integer.parseInt(hash.get(var).peek()[1]);
                    if(dataLayer == layer) {
                        sb.append("MULTIPLE DECLARATION");
                        i = num;
                    }else if(dataLayer < layer) {
                        String[] arrNew = {datatype, (layer + "")};
                        hash.get(var).push(arrNew);
                        layerVariables.get(layer).add(var);
                    }
                    
                }else {
                    Stack<String[]> stack = new Stack<String[]>();
                    
                    String[] arrNew = {datatype, (layer + "")};
                    stack.push(arrNew);
                    
                    hash.put(var, stack);
                    layerVariables.get(layer).add(var);
                }
                
            // Bracket open
            }else if(command == '{'){
                
                layer++;
                layerVariables.add(new Stack<String>());
                
            // Bracket closed
            }else if(command == '}') {

                Stack<String> stack = layerVariables.removeLast();
                while(!stack.isEmpty()) {
                    String word = stack.pop();
                    hash.get(word).pop();

                    if(hash.get(word).size() == 0) {
                        hash.remove(word);
                    }
                }
                  
                layer--;
            }
            
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
