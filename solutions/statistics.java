import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		while(scan.hasNextInt()) {
		
			i++;
			int input = scan.nextInt();
			int min = 1000000;
			int max = -1000000;
				
			for(int j = 1; j <= input; j++) {
						
				int num = scan.nextInt();
						
				if(num < min) {
					min = num;
				}
				if(num > max) {
					max = num;
				}	
				
			}
				
			System.out.println("Case " + i + ": " + min + " " + max + " " + (max - min));
					
			
			
		}
				
		scan.close();

	}

}