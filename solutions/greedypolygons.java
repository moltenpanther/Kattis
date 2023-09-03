import java.util.Scanner;

public class greedypolygons {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);    	
    	
    	int cases = scan.nextInt();
    	    	
    	for(int i = 0; i < cases; i++) {
	    	
    		double num = scan.nextInt();
    		double side = scan.nextInt();
    		double dis = scan.nextInt();
    		double grabs = scan.nextInt();
    		
    		dis *= grabs;
    		
    		double apothem = side / (2 * Math.tan(Math.toRadians(180 / num)));
    		double areaOld = (apothem * side * num) / 2;
    		
    		double angleIn = (num - 2) * 180 / num;
    		double angleOut = 180 - angleIn;
    		
    		double rectangle = side * dis;
    		double sector = (angleOut / 360) * Math.PI * Math.pow(dis, 2);
    		
    		double areaNew = num * (rectangle + sector);
    		double areaAll = areaOld + areaNew;

	    	System.out.println(areaAll);
    	}
   		
    	scan.close();
    }

}
