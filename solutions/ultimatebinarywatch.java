import java.util.Scanner;

public class Kattis{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String[][] display = {{". ", ". ", "  ", ". ", ". "},
        					  {". ", ". ", "  ", ". ", ". "},
        					  {". ", ". ", "  ", ". ", ". "},
        					  {". ", ". ", "  ", ". ", ". "}};
        	
        String time = scan.next();
        
        for(int i = 0; i < time.length(); i++) {
        	
        	int digit = Integer.parseInt(String.valueOf(time.charAt(i)));
        	
        	String binary = makeBinary(digit);
        	        	
        	for(int j = 0; j < 4; j++) {	
        		if(binary.charAt(j) == '1') {
        			if(i > 1) {
        				display[j][i + 1] = "* ";        				
        			}else {
        				display[j][i] = "* ";        				        				
        			}
        		}
        	}
        }
        
        for(int i = 0; i < 4; i++) {
        	String line = "";
        	for(int j = 0; j < 5; j++) {
        		line += display[i][j];
        	}
        	System.out.println(line.substring(0, line.length() - 1));
        }
        
        scan.close();
    }
    
    public static String makeBinary(int num) {
    	
    	int twos = 8;
    	String binary = "";
    	
    	for(int i = 0; i < 4; i++) {		   	
	    	if(num - twos >= 0) {
	    		num -= twos;
	    		binary += '1';
	    	}else {
	    		binary += '0';	    	
	    	}
	    	twos /= 2;
    	}	
    	 	
    	return binary;
    }
    
}