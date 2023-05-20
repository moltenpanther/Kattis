import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		String[] names = new String[num];
		String[] order = new String[num];
		
		int count = 0;
		for(int i = 0; i < num; i++) {
			
			names[i] = scan.next();
			order[i] = names[i];
		}
		
		Arrays.sort(order);
		
		for(int i = 0; i < num; i++) {
		
			if(names[i].equals(order[i])) {
				count++;
			}
		}
				
		if(count == num) {
			System.out.println("INCREASING");
		}else {
			int j = 0;
			count = 0;
			for(int i = num - 1; i >= 0; i--) {

				if(names[i].equals(order[j])) {
					count++;
					j++;
				}
			}
			if(count == num) {
				System.out.println("DECREASING");
			}else {
				System.out.println("NEITHER");			
			}
		}
		
		scan.close();
	}

}