import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fizzbuzz2 {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] line = br.readLine().split(" ");
    	int candidates = Integer.parseInt(line[0]);
    	int num = Integer.parseInt(line[1]);
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 1; i <= num; i++) {
    		
    		if(i % 3 == 0 && i % 5 == 0) {
    			sb.append("fizzbuzz ");
    		}else if(i % 5 == 0) {
    			sb.append("buzz ");
    		}else if(i % 3 == 0) {
    			sb.append("fizz ");
    		}else {
    			sb.append(i + " ");
    		}
    		
    	}
    	
    	String[] out = sb.toString().split(" ");
    	int index = 0;
    	int max = -1;
    	for(int i = 1; i <= candidates; i++) {
    		
    		line = br.readLine().split(" ");
    		
    		int sum = 0;
    		for(int j = 0; j < line.length; j++) {
    			if(line[j].equals(out[j])) {
    				sum++;
    			}
    		}
    		
    		if(sum > max) {
    			max = sum;
    			index = i;
    		}
    		
    	}
    	
    	// Output
    	System.out.println(index);
   		
    	br.close();
    }

}
