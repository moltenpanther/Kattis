import java.util.Hashtable;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int drivers = scan.nextInt();
        
        Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
        
        for(int i = 0; i < num; i++) {
        	String line = scan.next();
        	hash.put(line, i);
        }
        
        for(int i = 0; i < drivers; i++) {
        	
        	String street1 = scan.next();
        	String street2 = scan.next();
        	
        	int pos1 = hash.get(street1);
        	int pos2 = hash.get(street2);
        	
        	int ans = Math.abs(pos2 - pos1) - 1;
        	
        	System.out.println(ans);
        	
        }
        
        scan.close();
    }    
    
}