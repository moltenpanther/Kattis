import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int num = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < num; i++) {
			
			String line = scan.nextLine();
			if(line.length() > 9) {
				if(line.substring(0, 10).equals("simon says")) {
					if(line.length() > 11) {
						System.out.println(line.substring(11));						
					}else {
						System.out.println();
					}
				}else {
					System.out.println();
				}
			}else {
				System.out.println();
			}
		}
		scan.close();
	}
	
}
