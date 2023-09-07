import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vefthjonatjon {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int num = Integer.parseInt(br.readLine());
    	int[] parts = new int[3];
    			
    	for(int i = 0; i < num; i++) {	
    		String[] server = br.readLine().split(" ");
    		for(int j = 0; j < 3; j++) {
    			char letter = server[j].charAt(0);
    			if(letter == 'J') {
    				parts[j]++;
    			}
    		}
    	}
    	
    	int min = Integer.MAX_VALUE;
    	for(int i = 0; i < 3; i++) {
    		if(parts[i] < min) {
    			min = parts[i];
    		}
    	}
    	
    	System.out.println(min);
    	
    	br.close();
    }

}
