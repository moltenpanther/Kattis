import java.util.Scanner;

public class splat {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
        	
        	int drops = scan.nextInt();
        	
        	double[] x = new double[drops];
        	double[] y = new double[drops];
        	double[] radius = new double[drops];
        	String[] color = new String[drops];
        	for(int j = 0; j < drops; j++) {
        		
        		x[j] = scan.nextDouble();
        		y[j] = scan.nextDouble();
        		
        		double volume = scan.nextDouble();
        		radius[j] = Math.sqrt(volume / Math.PI);
        		color[j] = scan.next();
        	}
        	
        	int checks = scan.nextInt();
        	for(int j = 0; j < checks; j++) {
        		
        		double checkX = scan.nextDouble();
        		double checkY = scan.nextDouble();
        		
        		boolean paint = false;
        		for(int k = drops - 1; k >= 0; k--) {
        			
        			// Check Distance
        			double dis = Math.sqrt(Math.pow(checkX - x[k], 2) + Math.pow(checkY - y[k], 2));
        			if(dis <= radius[k]) {
        				System.out.println(color[k]);
        				paint = true;
        				k = -1;
        			}
        		}
        		
        		if(!paint) {
        			System.out.println("white");
        		}
        		
        	}
        	
        	
        }
        
        
        
        
        scan.close();
        
	}

}
