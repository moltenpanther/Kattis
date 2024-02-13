import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class sim {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String line = br.readLine();
            LinkedList<Deque<Character>> list = new LinkedList<Deque<Character>>();
            Deque<Character> stack = new ArrayDeque<Character>();
            
            boolean start = false;
            for(int j = 0; j < line.length(); j++) {
                
                char ch = line.charAt(j);
                
                // Go to end
                if(ch == ']') {
                    
                    if(!stack.isEmpty()) {
                        if(start) {
                            list.addFirst(stack);
                            stack = new ArrayDeque<Character>();
                        }
                    }
                    start = false;
                    
                // Go to start
                }else if(ch == '[') {
                    
                    if(!stack.isEmpty()) {
                        if(start) {
                            list.addFirst(stack);
                        }else {
                            list.addLast(stack);
                        }
                        stack = new ArrayDeque<Character>();
                    }
                    
                    start = true;
                    
                // Backspace
                }else if(ch == '<') {
                    if(!stack.isEmpty()) {
                        stack.removeLast();                     
                    }else {
                        if(!start) {                            
                            if(list.size() > 0) {
                                stack = list.removeLast();
                                stack.removeLast();                         
                            }
                        }
                    }

                }else {
                    stack.add(ch);
                }
            }
            
            // Adding the last one if it wasn't already
            if(!stack.isEmpty()) {
                if(start) {
                    list.addFirst(stack);
                }else {
                    list.addLast(stack);
                }
            }
            
            // Output
            StringBuilder sb = new StringBuilder();
            for(Deque<Character> deque : list) {
                for(char ch : deque) {
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
        
        
        br.close();
    }

}
