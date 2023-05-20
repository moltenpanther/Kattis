import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	HashMap<String, Integer> terms = new HashMap<String, Integer>();
    	
    	int termNum = Integer.parseInt(scan.next());
    	int descNum = Integer.parseInt(scan.next());
    	
    	for(int i = 0; i < termNum; i++) {
    		String term = scan.next();
    		int score = Integer.parseInt(scan.next());
    		terms.put(term, score);
    	}
    	
    	for(int i = 0; i < descNum; i++) {
    		
    		int sum = 0;
    		String word = "";
    		while(!(word = scan.next()).equals(".")){
    			if(terms.get(word) != null) {
    				sum += terms.get(word);
    			}
    		}
    		System.out.println(sum);
    	}
    	
    	
    	scan.close();
	}
}