import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kattis {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int num = Integer.parseInt(br.readLine());
    	
    	String pub = "";
    	int max = -1;
    	
    	for(int i = 0; i < num; i++) {
    		
    		String[] line = br.readLine().split(" ");
    		int people = Integer.parseInt(line[1]) + 1;
    		int timePer = Integer.parseInt(line[2]);
    		
    		int time = people * timePer;
    		if(time > max) {
    			max = time;
    			pub = line[0];
    		}
    		
    	}
    	
    	// Output
    	System.out.println(pub + " " + max);
   		
    	br.close();
    }

}
