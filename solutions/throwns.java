import java.util.Scanner;
import java.util.Stack;

public class throwns {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int students = Integer.parseInt(scan.next());
        int num = Integer.parseInt(scan.next());
        
        for(int i = 0; i < num; i++) {
            
            String command = scan.next();
            
            if(command.charAt(0) == 'u') {
                int undo = Integer.parseInt(scan.next());
                for(int j = 0; j < undo; j++) {
                    stack.pop();
                }
            }else {
                stack.push(Integer.parseInt(command));
            }
            
        }
        
        int sum = 0;
        for(int stu : stack) {
            sum += stu;
        }
        
        int ans = 0;
        while(sum < 0) {
            sum += students;
        }
        
        ans = sum % students;           
        
        // Output
        System.out.println(ans);
        
        scan.close();
    }

}

