import java.util.Scanner;

public class temperatureconfusion {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
       	String[] fraction = scan.next().split("/");
       	int aF = Integer.parseInt(fraction[0]);
       	int bF = Integer.parseInt(fraction[1]);
       	
       	int aC = 5 * (aF - (32 * bF));
       	int bC = 9 * bF;
       	
       	int gcd = findGCD(aC, bC);
       	
       	int aAns = aC / gcd;
       	int bAns = bC / gcd;
       	
       	if(bAns < 0) {
       		aAns *= -1;
       		bAns *= -1;
       	}
       	
    	// Output
    	System.out.println(aAns + "/" + bAns);
    	
    	scan.close();
    }
    
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}
