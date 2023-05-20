import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int len = String.valueOf(num).length();
		
		while(len > 1) {
			
			String str = String.valueOf(num);
			int multi = 1;
			for(int i = 0; i < len; i++) {
				
				int check = Integer.parseInt(str.charAt(i) + "");
								
				if(check != 0) {
					
					multi *= check;					
				}
			}	
			
			num = multi;
			len = String.valueOf(num).length();
		}
		
		System.out.println(num);
		
		scan.close();
	}
}