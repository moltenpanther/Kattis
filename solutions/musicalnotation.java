import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash = fillHash(hash);
        
        // 27 Length per line
        String notes = "GFEDCBAgfedcba";
        notes +=       "::::::::::::::";
        notes +=       "              ";
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
        	
        	String blankStaff = " - - - - -   -";
        	String note = scan.next();
        	
        	int index = hash.get(note.charAt(0) + "");
        	int length = 1;
        	if(note.length() > 1) {
        		length = Integer.parseInt(note.substring(1));
        	}
        	
        	for(int j = 0; j < length; j++) {
        		String staff = blankStaff.substring(0, index) + '*';	
        		if(index != 14) {
        			staff += blankStaff.substring(index + 1);
        		}   		
        		notes += staff;        		
        	}
        	
        	if(i < num - 1) {
        		notes += blankStaff;
        	}else {
        		notes +="\n\n\n\n\n\n\n\n\n\n\n\n\n";
        	}
        	
        }
        
        int i = 0;
        int j = 0;
        int len = 14;
        int count = 0;
        String line = "";
        while(count < notes.length()) {
        	
        	int index = i + (j * len);
        	if(index >= notes.length()) {
        		i++;
        		j = 0;
        		index = i + (j * len);
        	}

        	line += notes.charAt(index) + "";
        	count++;
        	j++;
        	
        }
        
        System.out.println(line);
        
        scan.close();
    }
    
    public static HashMap<String, Integer> fillHash(HashMap<String, Integer> hash) {
    	
    	hash.put("G", 0);
    	hash.put("F", 1);
    	hash.put("E", 2);
    	hash.put("D", 3);
    	hash.put("C", 4);
    	hash.put("B", 5);
    	hash.put("A", 6);
    	hash.put("g", 7);
    	hash.put("f", 8);
    	hash.put("e", 9);
    	hash.put("d", 10);
    	hash.put("c", 11);
    	hash.put("b", 12);
    	hash.put("a", 13);
    	
    	return hash;
    }
    
    
}
