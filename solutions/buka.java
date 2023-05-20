import java.math.BigInteger;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		BigInteger num1 = scan.nextBigInteger();
		String math = scan.next();
		BigInteger num2 = scan.nextBigInteger();

		if(math.equals("*")) {
			System.out.println(num1.multiply(num2));
		}else {
			System.out.println(num1.add(num2));
		}
		scan.close();
	}	
}	