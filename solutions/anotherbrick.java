import java.util.Scanner;

public class anotherbrick {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int height = scan.nextInt();
        int width = scan.nextInt();
        int bricks = scan.nextInt();

        // Counting
        int sum = 0;
        int layers = 0;
        boolean good = false;
        for(int i = 0; i < bricks; i++) {
        	
        	int brick = scan.nextInt();
        	sum += brick;
        	
        	// Fits
        	if(sum == width) {
        		layers++;
        		if(layers == height) {
        			i = bricks;
        			good = true;
        		}
        		sum = 0;
        	}
        	
        	// Too big
        	if(sum > width) {
        		i = bricks;
        	}        	
        }

        // Output
        if(good) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
                
        scan.close();
    }

}
