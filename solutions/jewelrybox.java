import java.util.Scanner;

public class Kattis2 {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	for(int i = 0; i < num; i++) {
    		    		
	    	int x = scan.nextInt();
	    	int y = scan.nextInt();
	
	    	double a = 12;
	    	double b = (-4 * x) + (-4 * y);
	    	double c = x * y;
	    	
	    	double pos = ((-1 * b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
	    	double neg = ((-1 * b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
	
	    	double vPos = (x - 2 * pos) * (y - 2 * pos) * pos;
	    	double vNeg = (x - 2 * neg) * (y - 2 * neg) * neg;
	    	
	    	// Output
	    	if(vPos > vNeg) {
	    		System.out.println(vPos);    		
	    	}else {
	    		System.out.println(vNeg);
	    	}
	    	
    	}
   		
    	scan.close();
    }

}
