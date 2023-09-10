import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class hradgreining {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	String input = br.readLine();
    	
    	boolean cov = false;
    	if(input.contains("COV")) {
    		cov = true;
    	}
    	
    	// Output
    	if(cov) {
    		System.out.println("Veikur!");    		
    	}else {
    		System.out.println("Ekki veikur!");
    	}
   		
    	br.close();
    }

}
