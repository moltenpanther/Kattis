import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class evenup {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Deque<Integer> stack = new LinkedList<Integer>();
        Deque<Integer> aux = new LinkedList<Integer>();
        
        int num = Integer.parseInt(br.readLine());
        
        // Reading input
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < line.length; i++) {
            int sock = Integer.parseInt(line[i]);
            stack.add(sock);
        }
        
        // Sock matching
        while(!stack.isEmpty()) {
            
            // Match!
            if(!aux.isEmpty() && aux.peek() % 2 == stack.peek() % 2) {
                aux.pop();
                stack.pop();
                num--;
            }else {
                aux.push(stack.pop());
            }
        }
        
        // Output
        System.out.println(aux.size() + stack.size());
        
        br.close();
    }

}
