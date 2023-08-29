import java.util.Scanner;

public class cookingwater {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int min = 0;
        int max = 1001;
        
        int num = scan.nextInt();

        boolean good = false;
        for(int i = 0; i < num; i++) {
        	
            good = false;
        
        	int start = scan.nextInt();
        	int end = scan.nextInt();
        	
        	if(start <= min && end >= max) {
        		good = true;
        	}else {
	        	if(start >= min) {
	        		min = start;
	        		good = true;
	        	}
	        	if(end <= max) {
	        		max = end;
	        		good = true;
	        	}
	        	        	
	        	if(!good || min > max) {
	        		
	        		System.out.println("edward is right");
	        		i = num;
	        		good = false;
	        	}
        	}
        	  	
        }
        
        if(good) {
        	System.out.println("gunilla has a point");        	
        }
        
        scan.close();
    }
}
