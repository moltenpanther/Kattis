import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String line = "";
		while(!(line = scan.nextLine()).equals("0 0")) {
			
			String[] nums = line.split(" ");
			int num1 = Integer.parseInt(nums[0]);
			int num2 = Integer.parseInt(nums[1]);
			int count = 0;
			int carry = 0;
			while(num1 != 0 || num2 != 0) {
				
				int dig1 = num1 % 10;
				int dig2 = num2 % 10;
				if(dig1 + dig2 + carry > 9) {
					count++;
					carry = 1;
				}else {
					carry = 0;
				}
				
				num1 /= 10;
				num2 /= 10;
			}
				
			if(count == 0) {
				System.out.println("No carry operation.");
			}else if(count == 1){
				System.out.println(count + " carry operation.");
			}else {
				System.out.println(count + " carry operations.");
			}
			
		}
		
		scan.close();
	}
	
}
