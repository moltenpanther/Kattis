import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	String command;
		
    	scan.nextLine();
    	
    	for(int i = 1; i <= n; i++) {
    		command = scan.nextLine();
    			if(command.length() < 12) {
    			}else if(command.substring(0, 11).equals("Simon says ")) {
    				System.out.println(command.substring(11, command.length()));
    			}else {}
    	}  	
    	scan.close();
    }
}