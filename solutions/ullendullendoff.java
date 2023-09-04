import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ullendullendoff {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	String[] names = br.readLine().split(" ");
    	
    	// Output
    	if(num > 13) {
    		System.out.println(names[12]);
    	}else {
    		int count = 13;
    		while(count > num) {
    			count -= num;
    		}
    		System.out.println(names[count - 1]);    		
    	}
    	
    	br.close();
    }

}
