import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int prevT = scan.nextInt();
		int prevD = scan.nextInt();
		int max = -1;
		int div = 0;
		for(int i = 1; i < num; i++) {
			
			int time = scan.nextInt();
			int dist = scan.nextInt();
			
			int difT = time - prevT;
			int difD = dist - prevD;
			
			prevT = time;
			prevD = dist;
			
			
			div = difD / difT;

			if(div > max) {
				max = div;
			}
					
		}
	
		System.out.println(max);
			
		scan.close();
	}
	
}