import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double dis = scan.nextDouble();
        int num = scan.nextInt();
        
        while(dis + num != 0) {
        	        
	        double[] x = new double[num];
	        double[] y = new double[num];
	        
	        for(int i = 0; i < num; i++) {
	        	x[i] = scan.nextDouble();
	        	y[i] = scan.nextDouble();
	        }
	        
	        int sour = 0;
	        int sweet = 0;
	        for(int i = 0; i < num; i++) {
	        	
	        	double hiveX = x[i];
	        	double hiveY = y[i];
	        	
	        	boolean inRange = false;
	        	for(int j = 0; j < num; j++) {
	        		
	        		if(i != j) {        			
		        		double newX = x[j];
		        		double newY = y[j];
		        		
		        		double currDis = Math.sqrt(Math.pow((newX - hiveX), 2) + Math.pow((newY - hiveY), 2));
		        		if(currDis < dis) {
		        			inRange = true;
		        			j = num;
		        		}
	        		}
	        	}
	        	
	        	if(inRange) {
	        		sour++;
	        	}else {
	        		sweet++;
	        	}
	        }     
	        
	        System.out.println(sour + " sour, " + sweet + " sweet"); 
	    
	        dis = scan.nextDouble();
	        num = scan.nextInt();
	        
        }
        scan.close();
        
	}

}
