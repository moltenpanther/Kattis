import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class pizzubestun {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	long[] prices = new long[num];
    	
    	for(int i = 0; i < num; i++) {
    		String[] order = br.readLine().split(" ");
	    	long price = Long.parseLong(order[1]);
    		prices[i] = price;
    	}
    	
    	Arrays.sort(prices);
    	
    	long sum = 0;
    	for(int i = num - 1; i >= 0; i -= 2) {
    		sum += prices[i];
    	}

    	// Output
    	System.out.println(sum);
   		
    	br.close();
    }

}
