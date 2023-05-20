import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		int num = scan.nextInt();
		while(num != 0) {
			
			String[] names = new String[num];
			String[] sorted = new String[num];
			for(int i = 0; i < num; i++) {
				names[i] = scan.next();
				sorted[i] = names[i];
			}
			
			for(int i = 0; i < names.length - 1; i++) {
				for(int j = 0; j < names.length - 1; j++) {
				
					int val1 = (names[j].charAt(0) * 100) + names[j].charAt(1);
					int val2 = (names[j + 1].charAt(0) * 100) + names[j + 1].charAt(1);
	
					if(val2 < val1) {
						String temp = names[j + 1];
						names[j + 1] = names[j];
						names[j] = temp;
					}
				}
			}
	
			for(String i: names) {
				System.out.println(i);
			}
			System.out.println();
			num = scan.nextInt();
		}
		
		scan.close();
	}	
	
}	