import java.util.Hashtable;
import java.util.Scanner;

public class saxophone {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        // Loading note fingers
        Hashtable<Character, boolean[]> hash = loadFingers();
        
        
        int num = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < num; i++) {
        	
        	String song = scan.nextLine();
        	int[] count = new int[10];
        	boolean[] hand = {false, false, false, false, false, false, false, false, false, false};
        	
        	for(int j = 0; j < song.length(); j++) {
        		
        		char note = song.charAt(j);
        		boolean[] fingers = hash.get(note);
        		
        		// Loop through the hand/finger arrays
        		for(int k = 0; k < 10; k++) {
        			if(!hand[k] && fingers[k]) {
        				count[k]++;
        			}
        			hand[k] = fingers[k];
        		}
        		
        	}
        	
        	for(int j = 0; j < 10; j++) {
    			System.out.print(count[j] + " ");
    		}
        	System.out.println();
        	
        }
        
        
        
        System.out.println();
        
        scan.close();
    }

	public static Hashtable<Character, boolean[]> loadFingers() {
		
		Hashtable<Character, boolean[]> hash = new Hashtable<Character, boolean[]>();
		
		boolean[] listc = {false, true, true, true, false, false, true, true, true, true};
		hash.put('c', listc);
		boolean[] listd = {false, true, true, true, false, false, true, true, true, false};
		hash.put('d', listd);
		boolean[] liste = {false, true, true, true, false, false, true, true, false, false};
		hash.put('e', liste);
		boolean[] listf = {false, true, true, true, false, false, true, false, false, false};
		hash.put('f', listf);
		boolean[] listg = {false, true, true, true, false, false, false, false, false, false};
		hash.put('g', listg);
		boolean[] lista = {false, true, true, false, false, false, false, false, false, false};
		hash.put('a', lista);
		boolean[] listb = {false, true, false, false, false, false, false, false, false, false};
		hash.put('b', listb);
		boolean[] listC = {false, false, true, false, false, false, false, false, false, false};
		hash.put('C', listC);
		boolean[] listD = {true, true, true, true, false, false, true, true, true, false};
		hash.put('D', listD);
		boolean[] listE = {true, true, true, true, false, false, true, true, false, false};
		hash.put('E', listE);
		boolean[] listF = {true, true, true, true, false, false, true, false, false, false};
		hash.put('F', listF);
		boolean[] listG = {true, true, true, true, false, false, false, false, false, false};
		hash.put('G', listG);
		boolean[] listA = {true, true, true, false, false, false, false, false, false, false};
		hash.put('A', listA);
		boolean[] listB = {true, true, false, false, false, false, false, false, false, false};
		hash.put('B', listB);
				
		return hash;
	}

}
