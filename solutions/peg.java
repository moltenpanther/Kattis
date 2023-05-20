import java.util.Scanner;

public class peg {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char[][] grid = new char[7][7];
        
        for(int i = 0; i < 7; i++) {
        	
        	String line = scan.nextLine();
        	if(i < 2 || i > 4) {
        		for(int j = 2; j < 5; j++) {
        			grid[i][j] = line.charAt(j);
        		}        		
        	}else {
        		for(int j = 0; j < 7; j++) {
        			grid[i][j] = line.charAt(j);
        		}        	
        	}
        }
        
        int count = 0;
        for(int i = 0; i < 7; i++) {  	
      		for(int j = 0; j < 7; j++) {
      			if(grid[i][j] == '.') {
      				
      				if(i > 1) {
      					if(grid[i - 1][j] == 'o' && grid[i - 2][j] == 'o') {
      						count++;
      					}      					
      				}
      				if(i < 5) {      					
	      				if(grid[i + 1][j] == 'o' && grid[i + 2][j] == 'o') {
	      					count++;
	      				}
      				}
      				if(j > 1) {      					
	      				if(grid[i][j - 1] == 'o' && grid[i][j - 2] == 'o') {
	      					count++;
	      				}
      				}
      				if(j < 5) {      					
	      				if(grid[i][j + 1] == 'o' && grid[i][j + 2] == 'o') {
	      					count++;
	      				}
      				}
      			}
      		}
        }
        
        System.out.println(count);
        
        scan.close();
    }
    
}
