import java.util.Scanner;

public class earlywinter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int days = scan.nextInt();
		
		int count = 0;
		for(int i = 0; i < num; i++) {
			
			int inp = scan.nextInt();
			if(inp < days) {
				count = i;
				i = num;
			}else if(inp > days) {
				count++;
			}else {
				i = num;
			}	
		}
		
		if(count == num) {
			System.out.println("It had never snowed this early!");
		}else {
			System.out.println("It hadn't snowed this early in " + count + " years!");			
		}
		
		scan.close();
	}
	
}