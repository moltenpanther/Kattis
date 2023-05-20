import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {
    	
		Scanner scan = new Scanner(System.in);
    	
		int climb = scan.nextInt();
		int slide = scan.nextInt();
		int height = scan.nextInt();
		
		int worm = 0;
		int count = 0;
		while(worm < height) {
			
			worm += climb;
			count++;
			if(worm >= height) {
				
			}else {
				worm -= slide;
			}
		}
		
		System.out.println(count);
		scan.close();
	}
	
}