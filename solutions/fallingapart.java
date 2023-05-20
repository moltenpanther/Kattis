import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] list = new int[num];
		
		int alice = 0;
		int bob = 0;
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			
			list[i] = scan.nextInt();
		}
		
		Arrays.sort(list);
		
		for(int i = num - 1; i >= 0; i--) {
			
			if(count % 2 == 0) {
				alice += list[i];
			}else {
				bob += list[i];
			}	
			count++;
		}
		
		System.out.println(alice + " " + bob);
		
		scan.close();
	}

}