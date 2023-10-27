import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ummcode {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashSet<Character> hash = getHash();
    	
    	StringBuilder sb = new StringBuilder();
    	
    	// Finding 'um' words
    	String[] line = br.readLine().split(" ");
    	for(int i = 0; i < line.length; i++) {
    		
    		String word = line[i];
    		
    		boolean good = true;
    		for(int j = 0; j < word.length() && good; j++) {
    			char ch = word.charAt(j);
    			if(hash.contains(ch)) {
    				good = false;
    			}
    		}
    		
    		if(good) {
    			sb.append(word);
    		}
    	}
    	    	
    	StringBuilder sbum = new StringBuilder();
    	StringBuilder sbans = new StringBuilder();
    	
    	int count = 0;
    	for(int i = 0; i < sb.length(); i++) {
    		
    		char ch = sb.charAt(i);
    		if(ch == 'u') {
    			sbum.append(1);
    			count++;
    		}else if(ch == 'm') {
    			sbum.append(0);
    			count++;
    		}
    		
    		if(count == 7) {
    			
    			sbans.append(getLetter(sbum.toString()));
    			
    			sbum = new StringBuilder();
    			count = 0;
    		}
    		
    	}
    	
    	// Output
    	System.out.println(sbans);
   		
    	br.close();
    }

	private static char getLetter(String binary) {
				
		int num = Integer.parseInt(binary, 2);
		char ch = (char) num;

		return ch;
	}

	private static HashSet<Character> getHash() {
    	
		HashSet<Character> hash = new HashSet<Character>();
		
		hash.add('0');
		hash.add('1');
		hash.add('2');
		hash.add('3');
		hash.add('4');
		hash.add('5');
		hash.add('6');
		hash.add('7');
		hash.add('8');
		hash.add('9');
		hash.add('A');
		hash.add('B');
		hash.add('C');
		hash.add('D');
		hash.add('E');
		hash.add('F');
		hash.add('G');
		hash.add('H');
		hash.add('I');
		hash.add('J');
		hash.add('K');
		hash.add('L');
		hash.add('M');
		hash.add('N');
		hash.add('O');
		hash.add('P');
		hash.add('Q');
		hash.add('R');
		hash.add('S');
		hash.add('T');
		hash.add('U');
		hash.add('V');
		hash.add('W');
		hash.add('X');
		hash.add('Y');
		hash.add('Z');
		hash.add('a');
		hash.add('b');
		hash.add('c');
		hash.add('d');
		hash.add('e');
		hash.add('f');
		hash.add('g');
		hash.add('h');
		hash.add('i');
		hash.add('j');
		hash.add('k');
		hash.add('l');
		hash.add('n');
		hash.add('o');
		hash.add('p');
		hash.add('q');
		hash.add('r');
		hash.add('s');
		hash.add('t');
		hash.add('v');
		hash.add('w');
		hash.add('x');
		hash.add('y');
		hash.add('z');
		
		return hash;
	}

}
