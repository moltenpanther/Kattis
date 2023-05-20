import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        hash = loadHash(hash);
        
        while(scan.hasNext()) {        	
	        String inp = scan.nextLine();
	        
	        int sum = 0;
	        for(int i = 0; i < inp.length(); i++) {
	        	int num = hash.get(inp.charAt(i));
	        	sum += num;
	        }
	        
	        System.out.println(sum);
        }
        
        scan.close();
    }    
    
    public static HashMap<Character, Integer> loadHash(HashMap<Character, Integer> hash){
    	
    	int ch = 32;
    	hash.put((char)ch++, 0);
    	hash.put((char)ch++, 9);
    	hash.put((char)ch++, 6);
    	hash.put((char)ch++, 24);
    	hash.put((char)ch++, 29);
    	hash.put((char)ch++, 22);
    	hash.put((char)ch++, 24);
    	hash.put((char)ch++, 3);
    	hash.put((char)ch++, 12);
    	hash.put((char)ch++, 12);
    	hash.put((char)ch++, 17);
    	hash.put((char)ch++, 13);
    	hash.put((char)ch++, 7);
    	hash.put((char)ch++, 7);
    	hash.put((char)ch++, 4);
    	hash.put((char)ch++, 10);
    	hash.put((char)ch++, 22);
    	hash.put((char)ch++, 19);
    	hash.put((char)ch++, 22);
    	hash.put((char)ch++, 23);
    	hash.put((char)ch++, 21);
    	hash.put((char)ch++, 27);
    	hash.put((char)ch++, 26);
    	hash.put((char)ch++, 16);
    	hash.put((char)ch++, 23);
    	hash.put((char)ch++, 26);
    	hash.put((char)ch++, 8);
    	hash.put((char)ch++, 11);
    	hash.put((char)ch++, 10);
    	hash.put((char)ch++, 14);
    	hash.put((char)ch++, 10);
    	hash.put((char)ch++, 15);
    	hash.put((char)ch++, 32);
    	hash.put((char)ch++, 24);
    	hash.put((char)ch++, 29);
    	hash.put((char)ch++, 20);
    	hash.put((char)ch++, 26);
    	hash.put((char)ch++, 26);
    	hash.put((char)ch++, 20);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 21);
    	hash.put((char)ch++, 16);
    	hash.put((char)ch++, 28);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 26);
    	hash.put((char)ch++, 23); // P	
    	hash.put((char)ch++, 31);
    	hash.put((char)ch++, 28);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 16);
    	hash.put((char)ch++, 23);
    	hash.put((char)ch++, 19);
    	hash.put((char)ch++, 26);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 14);
    	hash.put((char)ch++, 22);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 10);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 7);
    	hash.put((char)ch++, 8);
    	hash.put((char)ch++, 3);
    	hash.put((char)ch++, 23);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 17);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 23);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 30);
    	hash.put((char)ch++, 21);
    	hash.put((char)ch++, 15);
    	hash.put((char)ch++, 20);
    	hash.put((char)ch++, 21);
    	hash.put((char)ch++, 16);
    	hash.put((char)ch++, 22);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 20);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 25);
    	hash.put((char)ch++, 13);
    	hash.put((char)ch++, 21);
    	hash.put((char)ch++, 17);
    	hash.put((char)ch++, 17);
    	hash.put((char)ch++, 13);
    	hash.put((char)ch++, 19);
    	hash.put((char)ch++, 13);
    	hash.put((char)ch++, 24);
    	hash.put((char)ch++, 19);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 12);
    	hash.put((char)ch++, 18);
    	hash.put((char)ch++, 9);
    	
    	return hash;
    }
    
}
