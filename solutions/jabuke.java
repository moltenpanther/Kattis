import java.util.Scanner;

public class jabuke {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float x1 = scan.nextFloat();
		float y1 = scan.nextFloat();
		float x2 = scan.nextFloat();
		float y2 = scan.nextFloat();
		float x3 = scan.nextFloat();
		float y3 = scan.nextFloat();
		
		float area = calcArea(x1, y1, x2, y2, x3, y3);
		
		int num = scan.nextInt();
		int count = 0;
		for(int i = 0; i < num; i++) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			float area1 = calcArea(x, y, x2, y2, x3, y3);
			float area2 = calcArea(x1, y1, x, y, x3, y3);
			float area3 = calcArea(x1, y1, x2, y2, x, y);
			
			float areaTot = area1 + area2 + area3;
			
			if(areaTot == area) {
				count++;
			}
			
		}
		
		System.out.printf("%.1f\n%d", area, count);
		
		scan.close();
	}
	
	public static float calcArea(float x1, float y1, float x2, float y2, float x3, float y3) {
		
		return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
	}
	
}
