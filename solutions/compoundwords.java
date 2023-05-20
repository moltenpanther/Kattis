import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Kattis {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> segments = new ArrayList<String>();
		HashSet<String> words = new HashSet<String>();
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		
		while(scan.hasNext()) {
			String bit = scan.next();
			segments.add(bit);	
		}
		
		for(int i = 0; i < segments.size(); i++) {
			
			for(int j = i; j < segments.size(); j++) {
				
				if(i != j) {
					String word1 = segments.get(i) + segments.get(j);
					String word2 = segments.get(j) + segments.get(i);
					if(!words.contains(word1)) {
						words.add(word1);
						tree.put(word1, 0);
					}
					if(!words.contains(word2)) {
						words.add(word2);
						tree.put(word2, 0);
					}
				}
			}
		}
		
		while(!tree.isEmpty()) {
			String ans = tree.firstKey();
			System.out.println(ans);
			tree.remove(ans);
		}

		
		scan.close();
		
	}
	
}
