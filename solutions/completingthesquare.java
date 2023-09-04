import java.util.Scanner;

public class completingthesquare.java {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	// Loading input
    	double[] x = new double[3];
    	double[] y = new double[3];
    	for(int i = 0; i < 3; i++) {
    		x[i] = scan.nextDouble();
    		y[i] = scan.nextDouble();
    	}
    	    	
    	// Finding Distances
    	double[] dis = new double[3];
    	dis[0] = Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2));
    	dis[1] = Math.sqrt(Math.pow(x[1] - x[2], 2) + Math.pow(y[1] - y[2], 2));
    	dis[2] = Math.sqrt(Math.pow(x[2] - x[0], 2) + Math.pow(y[2] - y[0], 2));
    	
    	// Find Corner Coords
    	double cornerX = 0;
    	double cornerY = 0;
    	double x1 = 0;
    	double y1 = 0;
    	double x2 = 0;
    	double y2 = 0;
    	
    	if(dis[0] == dis[1]) {
    		cornerX = x[1];
    		cornerY = y[1];
    		x1 = x[0];
    		y1 = y[0];
    		x2 = x[2];
    		y2 = y[2];
    	}else if(dis[1] == dis[2]) {
    		cornerX = x[2];
    		cornerY = y[2];
    		x1 = x[1];
    		y1 = y[1];
    		x2 = x[0];
    		y2 = y[0];
    	}else if(dis[2] == dis[0]) {
    		cornerX = x[0];
    		cornerY = y[0];
    		x1 = x[2];
    		y1 = y[2];
    		x2 = x[1];
    		y2 = y[1];
    	}
    	
    	// Find Midpoint
    	double midX = (x1 + x2) / 2;
    	double midY = (y1 + y2) / 2;
    	
    	double outX = 2 * midX - cornerX;
    	double outY = 2 * midY - cornerY;
    	
    	// Output
    	System.out.println((int)outX + " " + (int)outY); 	
   		
    	scan.close();
    }

}
