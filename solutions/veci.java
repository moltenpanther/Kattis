import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String str = String.valueOf(num);
		int length = str.length();
		int[] digit = new int[length];
		int[] newNum = new int[length];
		String order = "";
		String orderNewNum = "";
		String orderNumRev = "";
		boolean end = false;
		boolean match = false;
		
		for(int i = 0; i < length; i++) {	
			digit[i] = Integer.parseInt(str.charAt(i) + "");
		}
	
		Arrays.sort(digit);
		
		for(int i = 0; i < length; i++) {
			order += digit[i];
		}
		
		for(int i = length - 1; i >= 0; i--) {					
			orderNumRev += digit[i];
		}
		
		if(orderNumRev.equals(str)) {
			System.out.println("0");
		}else {			
			
			while(!end) {
				
				match = false;
				while(!match) {
					
					num++;
					for(int i = 0; i < length; i++) {
						
						if(!String.valueOf(num).contains(String.valueOf(digit[i]))) {
							match = false;
							i = length;
						}else{
							match = true;
						}
					}
					
					if(match) {
						
						for(int i = 0; i < length; i++) {	
							newNum[i] = Integer.parseInt(String.valueOf(num).charAt(i) + "");
						}
						
						Arrays.sort(newNum);
						orderNewNum = "";
						
						for(int i = 0; i < length; i++) {			
							orderNewNum += newNum[i];
						}
							
						if(order.equals(orderNewNum)) {
							end = true;
						}
					}
				}
			}
			System.out.println(num);
		}
		scan.close();
	}
}