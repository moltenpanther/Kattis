import java.util.Hashtable;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        Hashtable<Integer, String> list = new Hashtable<Integer, String>();
        int count = 0;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
            	
            	int cost = scan.nextInt();
            	
            	if(cost >= 0) {
            		count++;
            		list.put(count, (i + 1) + " " + (j + 1) + " " + cost);
            	}
            }
        }
        
        System.out.println(count);
        for(int i = 1; i <= count; i++) {
        	System.out.println(list.get(i));
        }
           
        scan.close();
    }    
    
}