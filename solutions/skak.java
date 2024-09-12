import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class skak {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int rookX = Integer.parseInt(line[0]);
        int rookY = Integer.parseInt(line[1]);
        
        line = br.readLine().split(" ");
        int pawnX = Integer.parseInt(line[0]);
        int pawnY = Integer.parseInt(line[1]);
        
        // Output
        if(rookX == pawnX || rookY == pawnY) {
        	System.out.println("1");
        }else {
        	System.out.println("2");
        }
        
   		
    	br.close();
    }

}
