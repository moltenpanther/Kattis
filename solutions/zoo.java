import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = Integer.valueOf(scan.nextLine());
		int count = 0;
		
		while(num != 0) {
			
			String[] zoo = new String[num + 1];
			zoo[num] = "zzzzzz";
			
			for(int i = 0; i < num; i++) {
						
				String animal = scan.nextLine().toLowerCase();
				for(int j = animal.length() - 1; j >= 0; j--) {
					
					if(animal.contains(" ")) {
						if(animal.charAt(j) == ' ') {
							zoo[i] = animal.substring(j + 1, animal.length());
							j = -1;
						}
					}else {
						zoo[i] = animal;
							j = -1;
					}					
				}
			}
			count++;
			Arrays.sort(zoo);
			System.out.println("List " + count + ":");
			int animCount = 1;
			
			for(int i = 0; i < num; i++) {
				
				if(zoo[i].equals(zoo[i + 1])) {
					animCount++;
				}else {					
					System.out.println(zoo[i] + " | " + animCount);
					animCount = 1;
				}
				
			}
						
			num = Integer.valueOf(scan.nextLine());
		}
		scan.close();
	}
}