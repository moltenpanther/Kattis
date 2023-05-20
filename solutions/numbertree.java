import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] line = scan.nextLine().split(" ");
        
        int height = Integer.parseInt(line[0]) + 1;
        int num = 1;
                
        if(line.length > 1) {        	
	        
        	String dir = line[1];
	        
	        for(int i = 0; i < dir.length(); i++) {
	        	
	        	num *= 2;
	        	if(dir.charAt(i) == 'R') {
	        		num++;
	        	}
	        }	          
        }
        
        num = (int)(Math.pow(2, height) - num);
        System.out.println(num);
        
        scan.close();
    }
    
}
