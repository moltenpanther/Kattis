import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<String> rhymes = new ArrayList<String>();
		
		String word = scan.nextLine();
		int num = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < num; i++) {
			
			boolean match = false;
			String[] ends = scan.nextLine().split(" ");	
			for(int j = 0; j < ends.length; j++) {
				if(word.endsWith(ends[j])) {
					match = true;
					j = ends.length;
				}
			}
			
			if(match) {
				for(int j = 0; j < ends.length; j++) {
					rhymes.add(ends[j]);
				}
			}
		}
		
		num = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < num; i++) {
			
			String line = scan.nextLine();
			boolean match = false;
			for(int j = 0; j < rhymes.size(); j++) {
				
				if(line.endsWith(rhymes.get(j))) {
					match = true;
					j = rhymes.size();
				}
				
			}
			
			if(match) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
		
		scan.close();
	}
	
}
