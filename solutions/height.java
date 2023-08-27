import java.util.LinkedList;
import java.util.Scanner;

public class height {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();

      // Just Insertion Sort!
        for(int i = 0; i < num; i++) {
        	
        	// Loading the array
        	scan.nextInt();
        	int[] line = new int[20];
        	for(int j = 0; j < 20; j++) {
        		line[j] = scan.nextInt();
        	}
        	
        	int steps = 0;
        	for(int j = 1; j < 20; j++) {
        		
        		int kid = line[j];
        		int k = j - 1;
        		while(k >= 0 && line[k] > kid) {
        			line[k + 1] = line[k];
        			k--;
        			steps++;
        		}
        		
        		line[k + 1] = kid;
        		
        	}

        	System.out.println((i + 1) + " " + steps);
        	
        }
        
        scan.close();
    }

}
