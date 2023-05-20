import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] line = new int[num];
		int count = 1;
		line[0] = count++;
		
		for(int i = 0; i < num - 1; i++) {
			
			int spot = scan.nextInt();
			line[spot + 1] = count++; 
			
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(line[i] + " ");
		}
		
		scan.close();
	}
}