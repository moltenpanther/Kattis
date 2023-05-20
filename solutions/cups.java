import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int[] radius = new int[num];
		String[] color = new String[num];
		int[] orderRadius = new int[num];
		String[] orderColor = new String[num];
		
		for(int i = 0; i < num; i++) {
			
			String left = scan.next();
			String right = scan.next();
			
			if(left.charAt(0) >= 48 && left.charAt(0) <= 57) {
				radius[i] = Integer.valueOf(left) / 2;
				orderRadius[i] = Integer.valueOf(left) / 2;
				color[i] = right;
			}else {
				radius[i] = Integer.valueOf(right);				
				orderRadius[i] = Integer.valueOf(right);	
				color[i] = left;
			}
		}
		
		Arrays.sort(orderRadius);
			
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j < num; j++) {
				
				if(radius[i] == orderRadius[j]) {
					
					orderColor[j] = color[i];
				}
			}
		}
	
		for(int i = 0; i < num; i++) {
			
			System.out.println(orderColor[i]);
		}
		
		scan.close();
	}

}