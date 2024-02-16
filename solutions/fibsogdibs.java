import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibsogdibs {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Input
        String[] line = br.readLine().split(" ");
        long dag = Long.parseLong(line[0]);
        long elv = Long.parseLong(line[1]);
        
        long num = Long.parseLong(br.readLine()) * 2;
        long mod = 1000000007;

    	// Setting up the Fib matrix
        long[][] matrix = {{1, 1}, {1, 0}};
        long[][] ans = {{1, 0}, {0, 1}};
        
        // Doing matrix multiplication for a while
        while(num > 0) {
        	
        	if(num % 2 == 1) {
        		
        		long[][] temp = new long[2][2];
        		temp[0][0] = ((ans[0][0] * matrix[0][0]) + (ans[0][1] * matrix[1][0])) % mod;
        		temp[0][1] = ((ans[0][0] * matrix[0][1]) + (ans[0][1] * matrix[1][1])) % mod;
        		
        		temp[1][0] = ((ans[0][1] * matrix[0][0]) + (ans[1][1] * matrix[1][0])) % mod;
        		temp[1][1] = ((ans[0][1] * matrix[0][1]) + (ans[1][1] * matrix[1][1])) % mod;
        		
        		ans = temp;
        	}
        	
        	long[][] temp = new long[2][2];
    		temp[0][0] = ((matrix[0][0] * matrix[0][0]) + (matrix[0][1] * matrix[1][0])) % mod;
    		temp[0][1] = ((matrix[0][0] * matrix[0][1]) + (matrix[0][1] * matrix[1][1])) % mod;
    		
    		temp[1][0] = ((matrix[0][1] * matrix[0][0]) + (matrix[1][1] * matrix[1][0])) % mod;
    		temp[1][1] = ((matrix[0][1] * matrix[0][1]) + (matrix[1][1] * matrix[1][1])) % mod;
    		
    		matrix = temp;
        	
    		num = (long) Math.floor(num / 2);
        	
        }
        
        // Extracting the needs Fibs
        long fib1 = ans[1][1];
        long fib2 = ans[1][0];
        long fib3 = ans[0][0];
        
        long dagL = (fib1 * dag) % mod;
        long dagR = (fib2 * elv) % mod;
        long elvL = (fib2 * dag) % mod;
        long elvR = (fib3 * elv) % mod;
        
        // Output
        long dagAns = (dagL + dagR) % mod;
        long elvAns = (elvL + elvR) % mod;
        
    	System.out.println(dagAns + " " + elvAns);
   		
    	br.close();
    }

}
