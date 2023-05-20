import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] dwarves = new int[9];
		int sum = 0;
		int dif = 0;
		
		int bad1 = 0;
		int bad2 = 0;
		
		for(int i = 0; i < 9; i++) {
			
			dwarves[i] = scan.nextInt();
			sum += dwarves[i];
		}
		
		dif = sum - 100;
		
		for(int i = 0; i < 9; i++) {
				
			for(int j = i + 1; j < 9; j++) {
				
				if(dwarves[i] + dwarves[j] == dif) {

					bad1 = dwarves[i];
					bad2 = dwarves[j];
				}
			}
		}
		
		for(int i = 0; i < 9; i++) {
			
			if(dwarves[i] != bad1 && dwarves[i] != bad2) {
				
				System.out.println(dwarves[i]);
			}
		}
		
		scan.close();
	}

}