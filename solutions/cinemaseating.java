import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.Scanner;

public class cinemaseating {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] line = br.readLine().split(" ");
    	int rows = Integer.parseInt(line[0]) + 2;
    	int cols = Integer.parseInt(line[1]) + 2;
    	
    	boolean[][] theater = new boolean[rows][cols];
    	
    	// Filling the theater
    	int num = Integer.parseInt(br.readLine());
    	for(int i = 0; i < num; i++) {
    		line = br.readLine().split(" ");
        	int row = Integer.parseInt(line[0]);
        	int col = Integer.parseInt(line[1]);
        	
        	theater[row][col] = true;
    	}
    	
    	int[] counts = new int[9];
    	// Counting the adjacency
    	for(int i = 1; i < rows - 1; i++) {
    		for(int j = 1; j < cols - 1; j++) {
    			if(theater[i][j]) {
    				int count = countSeats(theater, i, j);
    				counts[count]++;    				
    			}
    		}
    	}

    	// Output
    	for(int i = 0; i < 9; i++) {
    		System.out.print(counts[i] + " ");
    	}
   		
    	br.close();
    }

	private static int countSeats(boolean[][] theater, int row, int col) {
		
		int count = 0;
		for(int i = row - 1 ; i <= row + 1; i++) {
			for(int j = col - 1; j <= col + 1; j++) {
				if(i != row || j != col) {
					if(theater[i][j]) {
						count++;
					}
				}	
			}
		}
		
		return count;
	}

}
