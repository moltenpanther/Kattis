import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float numAll = 0;
		float numRated = 0;
		float sum = 0;
		float min = 0;
		float max = 0;
		
		numAll = scan.nextFloat();
		numRated = scan.nextFloat();
		float dif = numAll - numRated;
		
		for(int i = 0; i < numRated; i++) {
			sum += scan.nextFloat();
		}
		
		max = ((dif * 3) + sum) / numAll;
		min = ((dif * -3) + sum) / numAll;
		
		System.out.println(min + " " + max);
	}
	
}
