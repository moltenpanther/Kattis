import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] order = new int[3];
		order[0] = scan.nextInt();
		order[1] = scan.nextInt();
		order[2] = scan.nextInt();		
		
		Arrays.sort(order);
		
		int dif1 = order[1] - order[0];
		int dif2 = order[2] - order[1];
		
		if(dif1 == dif2) {
			System.out.println((order[2] + dif1));
		}else if(dif1 > dif2){
			System.out.println((order[0] + dif2));
		}else {
			System.out.println((order[1] + dif1));
		}
		
		scan.close();
	}
}