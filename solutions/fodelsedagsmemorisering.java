import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] names = new String[num];
		int[] rating = new int[num];
		String[] birthday = new String[num];
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			
			names[i] = scan.next();
			rating[i] = scan.nextInt();
			birthday[i] = scan.next();
		}
		
		for(int i = 0; i < num; i++) {
			
			for(int j = i + 1; j < num; j++) {
				
				if(birthday[i].equals(birthday[j])) {
					
					if(rating[i] < rating[j]) {
						names[i] = "null";
						rating[i] = 0;
						birthday[i] = "null";
					}else {
						names[j] = "null";
						rating[j] = 0;
						birthday[j] = "null";
					}
				}
			}
		}
		
		for(int i = 0; i < num; i++) {
			
			if(!names[i].equals("null")) {
				count++;
			}
		}
		
		String[] ans = new String[count];
		int j = 0;
		
		for(int i = 0; i < num; i++) {
			
			if(!names[i].equals("null")){				
				ans[j] = names[i];
				j++;
			}
		}
		
		Arrays.sort(ans);
		System.out.println(count);
		
		for(int i = 0; i < count; i++) {
			
			System.out.println(ans[i]);
		}
		
		scan.close();
	}

}