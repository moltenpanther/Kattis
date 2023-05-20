import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String vowels = "aeiouy";
		
		while(scan.hasNext()) {
			
			String[] line = scan.nextLine().split(" ");
			
			for(int i = 0; i < line.length; i++) {
				
				if(vowels.contains(String.valueOf(line[i].charAt(0)))) {
					System.out.print(line[i] + "yay ");
				}else {
					int vow = 0;
					for(int j = 0; j < line[i].length(); j++) {
						if(vowels.contains(String.valueOf(line[i].charAt(j)))){
							vow = j;
							j = line[i].length();
						}
					}
					System.out.print(line[i].substring(vow) + line[i].substring(0, vow) + "ay ");
				}
			}
			System.out.println();	
		}	
	}
	
}
