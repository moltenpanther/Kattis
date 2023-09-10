import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hydrasheads {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	int heads = -1;
    	int tails = -1;
    	
    	String[] hydra = br.readLine().split(" ");
    	heads = Integer.parseInt(hydra[0]);
    	tails = Integer.parseInt(hydra[1]);
    	while(heads != 0 && tails != 0) {    		    		
	    	
	    	int count = 0;
	    	
	    	if(tails % 2 != 0) {
	    		count++;
	    		tails++;
	    	}
	    	
	    	if(heads % 2 == 0) {	    		
	    		if((tails / 2) % 2 != 0) {
	    			count += 2;
	    			tails += 2;
	    		}
	    	}else {
	    		if((tails / 2) % 2 == 0) {
	    			count += 2;
	    			tails += 2;
	    		}
	    	}
	    	
	    	count += tails / 2;
	    	heads += tails / 2;
	    	count += heads / 2;
	    	
	    	// Output
	    	System.out.println(count);
	    	
	    	hydra = br.readLine().split(" ");
	    	heads = Integer.parseInt(hydra[0]);
	    	tails = Integer.parseInt(hydra[1]);
    	}    	
    	
    	br.close();
    }

}
