import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		ArrayList<Integer> knots = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			knots.add(scan.nextInt());
		}
		
		for(int i = 0; i < num - 1; i++) {
			knots.remove(knots.indexOf(scan.nextInt()));
		}
		
		System.out.println(knots.get(0));
		
	}
	
}
