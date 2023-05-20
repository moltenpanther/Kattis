import java.util.Scanner;

public class coffeecupcombo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String lectures = scan.next();
		
		boolean alert = false;
		boolean zero = false;
		
		int count = 0;
		for(int i = 0; i < lectures.length(); i++) {
			
			char coffee = lectures.charAt(i);
				
			if(coffee == '1') {
				count++;
				alert = true;
				zero = false;
			}else{
				
				if(alert) {
					
					count++;							
					if(!zero) {
						zero = true;
					}else if(zero) {
						zero = false;
						alert = false;
					}
				}	
			}
			
		}
		
		System.out.println(count);
		
		scan.close();
	}
		
}