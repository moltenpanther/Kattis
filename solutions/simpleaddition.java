import java.math.BigInteger;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan.nextBigInteger().add(scan.nextBigInteger()));
		scan.close();
	}	
}	