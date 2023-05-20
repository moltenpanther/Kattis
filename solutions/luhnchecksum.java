import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int lines = scan.nextInt();

		for(int i = 1; i <= lines; i++) {
			String num = scan.next();
			int length = num.length();
			int sum = 0;
			int count = 0;
			int dig = 0;
			for(int j = length - 1; j >= 0; j--) {	
				if(count % 2 == 0){
					dig = Integer.parseInt(num.charAt(j) + ""); 					
					sum += dig;
					count++;

				}else {
					dig = Integer.parseInt(num.charAt(j) + "") * 2; 
					
					if(dig > 9){
						String digStr = String.valueOf(dig);
						dig = 0;
						for(int k = 0; k < digStr.length(); k++) {
							dig += Integer.parseInt(digStr.charAt(k) + "");
						}
					
					}
				
				sum += dig;
				count++;
				
				}
				
			}
			
			if(sum % 10 == 0) {
				System.out.println("PASS");
			}else {
				System.out.println("FAIL");
			}
			
		}
		
		scan.close();
		
	}

}