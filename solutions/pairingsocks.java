import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class pairingsocks {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> stack = new LinkedList<Integer>();
        Deque<Integer> aux = new LinkedList<Integer>();
        
        int num = Integer.parseInt(br.readLine());
        
        // Reading input
        String[] line = br.readLine().split(" ");
        for(int i = 0; i < line.length; i++) {
            int sock = Integer.parseInt(line[i]);
            stack.add(sock);
        }
        
        aux.push(-1);
        
        int moves = 0;
        // Sock matching
        while(!stack.isEmpty()) {
            
            // Match!
            if(aux.peek().equals(stack.peek())) {
                aux.pop();
                stack.pop();
                num--;
            }else {
                aux.push(stack.pop());
            }
            moves++;
        }
        
        // Output
        if(num != 0) {
            System.out.println("impossible");
        }else {
            System.out.println(moves);
        }
        
        br.close();
    }

}
