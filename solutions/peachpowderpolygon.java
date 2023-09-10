import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class peachpowderpolygon {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	int num = Integer.parseInt(br.readLine());
    	if((num / 2) % 2 == 0) {
    		System.out.println("No");
    	}else {
    		System.out.println("Yes");
    	}
   		
    	br.close();
    }

}
