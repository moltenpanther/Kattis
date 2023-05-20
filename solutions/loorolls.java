import java.math.BigInteger;
import java.util.Scanner;

public class loorolls {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BigInteger roll = new BigInteger(scan.next()); 
		BigInteger use = new BigInteger(scan.next());

		BigInteger currRoll = roll;
		BigInteger rem;
		rem = new BigInteger("1");
		
		int count = 0;
		BigInteger zero = new BigInteger("0");
		
		while(rem.compareTo(zero) != 0) {
			
			rem = currRoll.mod(use);
			// rem = currRoll % use;
			
			use = use.subtract(rem);
			// use -= rem;
			
			currRoll = roll.subtract(use);
			// currRoll = roll - use;			
			count++;
		}
		
		System.out.println(count);
		
		scan.close();
	}
	
}