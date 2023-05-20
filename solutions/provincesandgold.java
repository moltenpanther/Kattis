import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		int gold = scan.nextInt() * 3;
		int silv = scan.nextInt() * 2;
		int copp = scan.nextInt();
		int sum = gold + silv + copp;
		
		if(sum <= 1) {
			System.out.println("Copper");
		}else if(sum <= 2) {
			System.out.println("Estate or Copper");
		}else if(sum <= 4) {
			System.out.println("Estate or Silver");
		}else if(sum <= 5) {
			System.out.println("Duchy or Silver");
		}else if(sum <= 7) {
			System.out.println("Duchy or Gold");
		}else{
			System.out.println("Province or Gold");
		} 	
		scan.close();
	}
}