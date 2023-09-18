import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atlogur {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	int[] health = new int[num];
    	int[] strength = new int[num];
    	
    	for(int i = 0; i < num; i++) {
    		String[] knight = br.readLine().split(" ");
    		health[i] = Integer.parseInt(knight[0]);
    		strength[i] = Integer.parseInt(knight[1]);
    	}
    	
    	// Combat!
    	int index1 = 0;
    	int index2 = 1;
    	for(int i = 0; i < num - 1; i++) {
    		
    		boolean alive = true;
    		while(alive) {

    			health[index2] -= strength[index1];    			
    			if(health[index2] < 1) {
    				index2++;
    				alive = false;
    				break;
    			}
    			
    			health[index1] -= strength[index2];
    			if(health[index1] < 1) {
    				index1 = index2 + 1;
    				alive = false;
    				break;
    			}
    			
    		}
    		
    		if(index1 > index2) {
    			int temp = index2;
    			index2 = index1;
    			index1 = temp;
    		}
    		
    	}
    	
    	System.out.println(index1 + 1);
    	
    	br.close();
    }

}
