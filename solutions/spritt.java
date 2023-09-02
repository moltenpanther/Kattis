import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class spritt {

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] input = br.readLine().split(" ");  	
    	int classes = Integer.parseInt(input[0]);
    	int bottles = Integer.parseInt(input[1]);
    	
    	boolean enough = true;
    	for(int i = 0; i < classes; i++) {
    		   
    		int num = Integer.parseInt(br.readLine());
    		bottles -= num;
    		
    		if(bottles < 0) {
    			enough = false;
    		}
    	}
   		
    	// Output
    	if(enough) {
    		System.out.println("Jebb");  		    		
    	}else {
    		System.out.println("Neibb");
    	}
    	
    	br.close();
    	
    }

}
