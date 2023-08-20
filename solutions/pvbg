import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pvbg {

    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.valueOf(br.readLine());
    	String[] rows = br.readLine().split(" ");
    	int min = Integer.MAX_VALUE;
    	
    	for(int i = 0; i < rows.length; i++) {
    		
    		int peas = Integer.valueOf(rows[i]);
    		if(peas < min) {
    			min = peas;
    		}
    		
    		if(min == 1) {
    			i = num;
    		}
    		
    	}
    	System.out.println(min + 1);
    	
    	br.close();
    	
    }

}
