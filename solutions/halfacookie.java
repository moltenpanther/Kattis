import java.util.Scanner;

public class halfacookie {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			double rad = scan.nextDouble();
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			
			double dis = Math.sqrt(x * x + y * y);
			
			if(dis < rad) {				
				double chord = 2 * Math.sqrt(rad * rad - dis * dis);
				
				double triArea = dis * chord / 2;
				
				// Degrees or Radians??
				double tan = 2 * Math.atan((chord / 2) / dis);
				double sectorArea = (tan / 2) * rad * rad;
				double sectionArea = sectorArea - triArea;
				
				double fullArea = Math.PI * rad * rad;
				double biggerHalf = fullArea - sectionArea;
				
				
				System.out.printf("%.6f %.6f\n", biggerHalf, sectionArea);
			}else {
				System.out.println("miss");
			}
		}
		
		scan.close();
	}
	
}
