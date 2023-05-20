import java.util.Scanner;

public class Kattis{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String scores = scan.next();
		int a = 0;
		int b = 0;
		int dif = 0;
		boolean eleven = false;
		boolean by2 = false;
		boolean check = true;
		
		while(check) {
			for(int i = 0; i < scores.length(); i += 2) {
				
				if(scores.charAt(i) == 'A') {
					a += Integer.parseInt(scores.charAt(i + 1) + "");
				}else {
					b += Integer.parseInt(scores.charAt(i + 1) + "");
				}
				
				if(a > b) {
					dif = a - b;
				}else {
					dif = b - a;
				} 
				
				if(dif >= 2) {
					by2 = true;
				}else{
					by2 = false;
				}
				
				if(a >= 11 || b >= 11) {
					eleven = true;
				}else {
					eleven = false;
				}
				
				if(eleven && by2) {
					check = false;
				}
				
			}
			
		}
		if(a > b) {		
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
	
}