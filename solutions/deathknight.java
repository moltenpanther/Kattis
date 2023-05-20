import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int count = 0;
		for(int i = 0; i < num; i++) {
			if(!scan.next().contains("CD")) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
	
}