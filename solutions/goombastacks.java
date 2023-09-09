import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class goombastacks {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	int sum = 0;
    	
    	boolean possible = true;
    	for(int i = 0; i < num; i++) {
    		
    		String[] line = br.readLine().split(" ");
    		int goombas = Integer.parseInt(line[0]);
    		int button = Integer.parseInt(line[1]);    		
    		
    		sum += goombas;
    		if(sum < button) {
    			possible = false;
    			i = num;
    		}
    	}
    	
    	// Output
    	if(possible) {
    		System.out.println("possible");    		
    	}else {
    		System.out.println("impossible");    		
    	}
   		
    	br.close();
    }

}
