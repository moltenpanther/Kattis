import java.math.BigInteger;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        BigInteger sum = BigInteger.valueOf(0);
        for(int i = 2; i <= num; i++) {
        	
        	BigInteger top = BigInteger.valueOf(1);
        	for(int j = num; j > 0; j--) {
        		top = top.multiply(BigInteger.valueOf(j));
        	}
        	
        	BigInteger bottomL = BigInteger.valueOf(1);
        	for(int j = i; j > 0; j--) {
        		bottomL = bottomL.multiply(BigInteger.valueOf(j));
        	}
        	
        	BigInteger bottomR = BigInteger.valueOf(1);
        	for(int j = (num - i); j > 0; j--) {
        		bottomR = bottomR.multiply(BigInteger.valueOf(j));
        	}
        	
        	sum = sum.add(top.divide(bottomL.multiply(bottomR)));
        	
        }
        
        System.out.println(sum);
        
        scan.close();
        
	}

}
