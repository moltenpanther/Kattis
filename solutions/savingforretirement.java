import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int ageBob = scan.nextInt();
		int retireBob = scan.nextInt();
		int yearlyBob = scan.nextInt();
		int ageAlice = scan.nextInt();
		int yearlyAlice = scan.nextInt();
		
		int savedBob = (retireBob - ageBob) * yearlyBob;
		
		int savedAlice = 0;
		int count = 0;
		
		while(savedAlice <= savedBob) {
		
			savedAlice += yearlyAlice;
			count++;
		}
		
		System.out.println(ageAlice + count);
	
		scan.close();
	}

}