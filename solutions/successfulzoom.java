import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class successfulzoom {

    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int len = Integer.parseInt(br.readLine());
    	
    	String[] numStr = br.readLine().split(" ");
    	int[] num = new int[len + 1];
    	
    	for(int i = 0; i < len; i++) {
    		num[i + 1] = Integer.parseInt(numStr[i]);
    	}
    	
    	int ans = 0;
    	boolean good = true;
    	for(int i = 1; i <= len / 2; i++) {

    		int prev = -1;
    		good = true;
    		for(int j = i; j <= len; j += i) {
    			
    			int check = num[j];

    			if(check > prev) {
    				prev = check;
    			}else {
    				good = false;
    				j = num.length + 1;
    			}
    		}
    		
    		if(good) {
    			ans = i;
    			i = (len / 2) + 1;
    		}
    		
    	}
    	
    	// Output
    	if(good) {
    		System.out.println(ans);
    	}else {
    		System.out.println("ABORT!");
    	}
   		
        br.close();
    }

}
