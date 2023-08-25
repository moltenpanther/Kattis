import java.util.Scanner;

public class register {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int[] regs = {2, 3, 5, 7, 11, 13, 17, 19};
    	int[] curr = new int[8];
    	
    	for(int i = 0; i < 8; i++) {
    		curr[i] = scan.nextInt();
    	}
    	
    	// Calculating right to left to end with # of incs
    	int inc = 18 - curr[7];
    	for(int i = 6; i >= 0; i--) {
    		inc = (regs[i] * inc) + ((regs[i] - 1) - curr[i]);
    	}
    	
    	System.out.println(inc);
    	
    	scan.close();
    	
    }

}
