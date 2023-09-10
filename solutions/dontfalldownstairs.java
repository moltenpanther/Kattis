import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dontfalldownstairs {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	int num = Integer.parseInt(br.readLine());
    	
    	String line = br.readLine() + " 0";
    	String[] step = line.split(" ");
    	
    	int count = 0;
    	for(int i = 0; i < num; i++) {    		
    		if(Integer.parseInt(step[i]) == 0) {
    			i = num;
    		}else {
	    		int effort = Integer.parseInt(step[i]) - Integer.parseInt(step[i + 1]);
	    		if(effort > 1){
	    			count += effort - 1;
	    		}
    		}
    	}
    	
    	// Output
  		System.out.println(count);
    	
    	br.close();
    }

}
