import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] companies = new int[num];
		
		int numQ = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			companies[i] = scan.nextInt();
		}
		
		for(int i = 0; i < numQ; i++) {
			
			if(scan.nextInt() == 1) {
				companies[scan.nextInt() - 1] = scan.nextInt();
			}else {
				System.out.println(Math.abs(companies[scan.nextInt() - 1] - companies[scan.nextInt() - 1]));
			}			
		}
	}
	
}
