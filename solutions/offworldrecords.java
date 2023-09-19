import java.util.Scanner;

public class offworldrecords {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int curr = scan.nextInt();
        int prev = scan.nextInt();
        
        int count = 0;
        for(int i = 0; i < num; i++) {
        	int attempt = scan.nextInt();
        	if(attempt > curr + prev) {
        		prev = curr;
        		curr = attempt;
        		count++;
        	}
        }
        
        // Output
        System.out.println(count);
		
    	scan.close();
        
    }

}
