import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class elevatingtheprank {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int floorA = Integer.parseInt(line[0]);
        int floorB = Integer.parseInt(line[1]);
        
        // Swap if necessary
        if(floorB < floorA) {
        	int temp = floorA;
        	floorA = floorB;
        	floorB = temp;
        }
        
        int time = (floorB - floorA) * 4;
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
        	
        	int button = Integer.parseInt(br.readLine());
        	if(floorA < button && button < floorB) {
        		time += 10;
        	}
        }
        
        // Output
    	System.out.println(time);
   		
    	br.close();
    }

}
