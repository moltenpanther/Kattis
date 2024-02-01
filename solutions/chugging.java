import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chugging {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int num = Integer.parseInt(br.readLine());
    	
    	String[] line = br.readLine().split(" ");
    	int timeA = Integer.parseInt(line[0]);
    	int delayA = Integer.parseInt(line[1]);
    	
    	line = br.readLine().split(" ");
    	int timeB = Integer.parseInt(line[0]);
    	int delayB = Integer.parseInt(line[1]);
    	
    	int endA = 0;
    	int endB = 0;
    	
    	for(int i = 0; i < num; i++) {
    		endA += timeA + i * delayA;
    		endB += timeB + i * delayB;	
    	}
    	    	
    	// Output
    	if(endA > endB) {
    		System.out.println("Bob");    		
    	}else if(endA < endB) {
    		System.out.println("Alice");
    	}else {
    		System.out.println("=");
    	}
   		
    	br.close();
    }

}
