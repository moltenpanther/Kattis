import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
        	
        	double vel = scan.nextDouble();
        	double theta = Math.toRadians(scan.nextDouble());
        	double xDist = scan.nextDouble();
        	double height1 = scan.nextDouble() + 1;
        	double height2 = scan.nextDouble() - 1;
        	double time = xDist / (Math.cos(theta) * vel);
        	
        	double xPos = vel * time * Math.cos(theta);
        	double yPos = (vel * time * Math.sin(theta)) - (.5 * 9.81 * Math.pow(time, 2));
        	
        	if(yPos >= height1 && yPos <= height2) {
        		System.out.println("Safe");
        	}else {
        		System.out.println("Not Safe");
        	}  	
        }	
        scan.close();
    }

}