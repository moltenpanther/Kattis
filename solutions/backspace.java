import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String inp = scan.next();
        Stack<String> stack = new Stack<String>();
        
        for(int i = 0; i < inp.length(); i++) {
            
            char ch = inp.charAt(i);
            
            if(ch == '<') {
                stack.pop();
            }else {
            	stack.push(ch + "");
            }
            
        }
        
        String ans = stack.toString().replaceAll(", ", "").replace("[", "").replace("]", "");
        System.out.println(ans);
        
        
        scan.close();
        
    }   

}