import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		float min = 0;
		float sec = 0;
		
		for(int i = 0; i < num; i++) {
			
			min += scan.nextInt();
			sec += scan.nextInt();
		}

		float ans = sec / (min * 60);
		
		if(ans <= 1) {
			System.out.println("measurement error");
		}else {
			System.out.printf("%.12f", ans);			
		}

		scan.close();
	}

}