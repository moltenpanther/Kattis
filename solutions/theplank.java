import java.util.Scanner;

public class theplank {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int ans = calcLength(num);
		System.out.println(ans);
		
		scan.close();		
	}
	
	public static int calcLength(int num) {
		
		if(num < 0) {
			return 0;
		}else if(num == 0) {
			return 1;
		}else {
			return calcLength(num - 3) + calcLength(num - 2) + calcLength(num - 1);
		}

	}
	
}
