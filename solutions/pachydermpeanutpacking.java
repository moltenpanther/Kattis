import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Box> boxes = new ArrayList<Box>();
        
        int num = scan.nextInt();
        while(num != 0) {
        	        
	        for(int i = 0; i < num; i++) {
	        	
	        	double x1 = scan.nextDouble();
	        	double y1 = scan.nextDouble();
	        	double x2 = scan.nextDouble();
	        	double y2 = scan.nextDouble();
	        	String size = scan.next();
	        	
	        	boxes.add(new Box(x1, y1, x2, y2, size));
	        }
	        
	        num = scan.nextInt();
	        if(num > 0) {
	        		        
		        for(int i = 0; i < num; i++) {
		        	
		        	double x = scan.nextDouble();
		        	double y = scan.nextDouble();
		        	String size = scan.next();
		        	
		        	boolean match = false;
		        	for(int j = 0; j < boxes.size(); j++) {
		        		
		        		Box box = boxes.get(j);
		        		
		        		if(x >= box.x1 && x <= box.x2 && y >= box.y1 && y <= box.y2) {	
	        				if(size.equals(box.size)) {
	        					System.out.println(size + " correct");
	        				}else {
	        					System.out.println(size + " " + box.size);
	        				}
	        				
	        				match = true;
	        				j = boxes.size();   				
		        		}
		        	}
		        	
		        	if(!match) {
		        		System.out.println(size + " floor");
		        	}
		        	
		        }
		        System.out.println();	        	
	        }
	        
	        num = scan.nextInt();
	        boxes.clear();
        }    
        
        scan.close();
    }
    
}

class Box {
	
	double x1;
	double y1;
	double x2;
	double y2;
	String size;
	
	public Box(double x1, double y1, double x2, double y2, String size) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.size = size;
	}
	
}