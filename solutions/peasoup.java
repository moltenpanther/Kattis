import java.util.Scanner;

public class Kattis {
		
	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	boolean pancakes = false;
		boolean peaSoup = false;
		String res = "";
    	int num = Integer.parseInt(scan.nextLine());
    	for(int i = 0; i < num; i++) {
    		
    		pancakes = false;
    		peaSoup = false;
    		int num2 = Integer.parseInt(scan.nextLine());
    		
    		res = scan.nextLine();
    		
    		for(int j = 0; j < num2; j++) {
    			
    			String line = scan.nextLine();
    			if(line.equals("pancakes")) {
    				pancakes = true;
    			}
    			if(line.equals("pea soup")) {
    				peaSoup = true;
    			}
    			if(pancakes && peaSoup) {
    				i = num;
    				j = num2;
    			}
    		}
    	}
    	
    	if(pancakes && peaSoup) {
    		System.out.println(res);
    	}else {
    		System.out.println("Anywhere is fine I guess");    		
    	}
    	
    	scan.close();     	
	}
    	
}
