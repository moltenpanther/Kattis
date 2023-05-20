import java.util.Arrays;
import java.util.Scanner;

public class makingameowth {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nth = scan.nextInt();
		int pages = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int sum = 0;
		int nCount = 1;
		
		while(pages > 0) {
			
			if(nCount < nth) {
				sum += x;
				nCount++;
				pages--;
			}else {
				sum += y;
				nCount = 1;
			}
		}
		
		if(nCount == nth) {
			sum += y;
		}
		
		System.out.println(sum);
		
		scan.close();
	}
	
}