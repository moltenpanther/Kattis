import java.util.Scanner;

public class Kattis {
		
	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String line = "";
    	while(scan.hasNext()) {
    		
    		int num = Integer.parseInt(scan.nextLine());
    		line = scan.nextLine();
    		for(int i = 0; i < num; i++) {
    			line = addSlash(line);	
    		}
    		System.out.println(line);
    	}
    	
	}
	
	public static String addSlash(String line) {
		
		String ans = "";
		for(int i = 0; i < line.length(); i++) {
			char key = line.charAt(i);
			if((key >= '!' && key <= '*') || (key >= '[' && key <= ']')) {
				ans += '\\';
			}
			ans += key;
		}
		
		return ans;
	}
	
}
