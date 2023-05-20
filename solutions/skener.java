import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int row = scan.nextInt();
        int col = scan.nextInt();
        int row1 = scan.nextInt();
        int col1 = scan.nextInt();
        String ans = "";
        
        for(int i = 0; i < row; i++) {
        	
        	String line = scan.next();
        	int length = line.length();
        	ans = "";
        	
        	for(int j = 0; j < length; j++) {
        		
        		char check = line.charAt(j);
        		for(int k = 0; k < col1; k++) {
        			ans += check;
        		}
        	}
        	
    		for(int k = 0; k < row1; k ++) {
    			System.out.println(ans);
    		}
        }
        scan.close();
    }

}