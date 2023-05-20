import java.util.HashSet;
import java.util.Scanner;

public class Kattis {
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashSet<String> vowels = new HashSet<String>();
		loadSet(vowels);
		
		int num = scan.nextInt();
		while(num != 0) {
			
			int max = -1;
			String ans = "";

			for(int i = 0; i < num; i++) {
					
				int count = 0;
				String word = scan.next() + " ";
				for(int j = 0; j < word.length() - 1; j++) {
					
					String sub = word.substring(j, j + 2);
					if(vowels.contains(sub)) {
						count++;
					}	
				}
				
				if(count > max) {
					max = count;
					ans = word;
				}
				
			}
			System.out.println(ans);
		
			num = scan.nextInt();
		}
		
	}

	public static HashSet<String> loadSet(HashSet<String> vowels) {
		
		vowels.add("aa");
		vowels.add("ee");
		vowels.add("ii");
		vowels.add("oo");
		vowels.add("uu");
		vowels.add("yy");
		
		return vowels;
		
	}
	
}
