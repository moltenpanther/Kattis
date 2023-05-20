import java.util.Scanner;

public class divvyingup {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int tot = 0;
		
		for(int i = 0; i < num; i++) {
			tot += scan.nextInt();
		}
		
		if(tot % 3 == 0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		scan.close();
	}
		
}