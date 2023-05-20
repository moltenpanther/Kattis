import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int stars = scan.nextInt();
		System.out.println(stars + ":");
		for(int i = 2; i < stars; i++) {
			for(int j = i - 1; j <= i; j++) {
				int sum = 0;
				while(sum <= stars) {
					sum += i;
					if(sum == stars) {
						System.out.println(i + "," + j);
					}
					sum += j;
					if(sum == stars) {
						System.out.println(i + "," + j);
					}
				}
			}
		}
		scan.close();
	}
}