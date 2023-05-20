import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int height = 1;
		int area = height * height;
		
		int trueHeight = 0;
		boolean stacking = true;
		
		while(stacking) {
		
			num -= area;
			if(num < 0) {
				stacking = false;
			}else {
				height += 2;
				area = height * height;
				trueHeight++;
			}
			
		}
		
		System.out.println(trueHeight);
		
		scan.close();
	}
	
}