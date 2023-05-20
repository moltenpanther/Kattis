import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int countA = 1;
		int countB = 0;

		while(count > 0) {
			
			int tempA = 0;
			int tempB = 0;
			
			tempA = countB;
			tempB = countA + countB;
			
			countA = tempA;
			countB = tempB;
			
			count--;	
		}
		
		System.out.println(countA + " " + countB);
		
		scan.close();
	}
	
}