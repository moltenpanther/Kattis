import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bladra2 {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        double vel = Integer.parseInt(line[0]);
        double acc = Integer.parseInt(line[1]);
        double time = Integer.parseInt(line[2]);
        
        double dis = vel * time + (acc * time * time) / 2;

        // Output
    	System.out.println(dis);
   		
    	br.close();
    }

}
