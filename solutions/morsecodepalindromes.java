import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class morsecodepalindromes {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	Hashtable<Character, String> hash = fillHash();
    	String line = br.readLine().toLowerCase();
    	
    	StringBuilder sb = new StringBuilder();
       	for(int i = 0; i < line.length(); i++) {
    		char ch = line.charAt(i);
    		if(hash.containsKey(ch)) {
    			sb.append(hash.get(ch));    			
    		}
    	}
       	
       	String morse = sb.toString();
       	
       	boolean good = true;
       	for(int i = 0; i < morse.length() / 2; i++) {
       		
    		char start = morse.charAt(i);
    		char end = morse.charAt(morse.length() - (i + 1));
    		    		
    		if(start == end) {
    			good = true;
    		}else {
    			good = false;
    			break;
    		}
    	}
    	       	
    	// Output
    	if(good) {
    		System.out.println(1);
    	}else {
    		System.out.println(0);
    	}
    	   		
    	br.close();
    }

	private static Hashtable<Character, String> fillHash() {
		
		Hashtable<Character, String> hash = new Hashtable<Character, String>();
    	
		hash.put('a', "01");
		hash.put('b', "1000");
		hash.put('c', "1010");
		hash.put('d', "100");
		hash.put('e', "0");
		hash.put('f', "0010");
		hash.put('g', "110");
		hash.put('h', "0000");
		hash.put('i', "00");
		hash.put('j', "0111");
		hash.put('k', "101");
		hash.put('l', "0100");
		hash.put('m', "11");
		hash.put('n', "10");
		hash.put('o', "111");
		hash.put('p', "0110");
		hash.put('q', "1101");
		hash.put('r', "010");
		hash.put('s', "000");
		hash.put('t', "1");
		hash.put('u', "001");
		hash.put('v', "0001");
		hash.put('w', "011");
		hash.put('x', "1001");
		hash.put('y', "1011");
		hash.put('z', "1100");
		hash.put('0', "11111");
		hash.put('1', "01111");
		hash.put('2', "00111");
		hash.put('3', "00011");
		hash.put('4', "00001");
		hash.put('5', "00000");
		hash.put('6', "10000");
		hash.put('7', "11000");
		hash.put('8', "11100");
		hash.put('9', "11110");
		
		return hash;
    			
	}

}
