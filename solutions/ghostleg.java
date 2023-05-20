import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int cols = scan.nextInt();
        int rows = scan.nextInt();
        
        int[][] ladder = new int[rows + 1][cols + 1];
        
        for(int i = 1; i <= rows; i++) {
        	int num = scan.nextInt();
        	ladder[i][num] = num;
        	ladder[i][num + 1] = -num;
        }
        
        for(int i = 1; i <= cols; i++) {
        	
        	int num = i;
			for(int j = rows; j > 0; j--) {
		    	
				if(ladder[j][num] > 0) {
					num++;
				}else if(ladder[j][num] < 0) {
					num--;
				}
		    }
			
			System.out.println(num);
			
        }
           
        scan.close();
    }    
    
}