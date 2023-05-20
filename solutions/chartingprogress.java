import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) throws IOException {
    	
    	Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String astrx = "................................................................................";
    	String line = "";
    	int j = 0;
    	while((line = br.readLine()) != null) {
    		
    		if(line.equals("")) {
    			j = 0;
    		}
    		
    		int len = line.length();
	    	int stars = countStars(line);
	    	
	    	j += stars;
	    	
	    	String output = astrx.substring(0, len - j);
	    	for(int i = 0; i < stars; i++) {
	    		output += "*";
	    	}
	    	
	    	if(output.length() < len) {
	    		for(int i = output.length(); i < len; i++) {
	    			output += ".";
	    		}
	    	}
	    	System.out.println(output);
    	}
    	scan.close();
	}
	
	public static int countStars(String line) {
		
		int count = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '*') {
				count++;
			}
		}
		return count;
	}
}