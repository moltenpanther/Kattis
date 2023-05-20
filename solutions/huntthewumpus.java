import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<String> wumpuses = new ArrayList<String>();
        
        int num = scan.nextInt();

        // Load the board
        int[][] board = new int[10][10];
        while(wumpuses.size() < 4) {
        	
        	num = (int) (num + Math.floor(num / 13) + 15);
        	int seed = num;       
        	
        	int col = seed % 10;
        	seed /= 10;
        	int row = seed % 10;
        	
        	String pos = row + "" + col;
        	
        	if(!wumpuses.contains(pos)) {
        		wumpuses.add(pos);
      //  		System.out.println(pos);
        		board[row][col] = 1;        		
        	}
        	
        }
        
  /*      System.out.println();
        System.out.println("SIZE: " + wumpuses.size());
        for(int i = 0; i < 10; i++) {
        	for(int j = 0; j < 10; j++) {
        		System.out.print(board[i][j] + " ");
        	}
        	System.out.println();
        }    
        System.out.println();
  */
        
        int count = 0;
        
        while(scan.hasNext()) {
        	
        	String attack = scan.next();
        	int row = Integer.parseInt(attack.substring(0, 1));
        	int col = Integer.parseInt(attack.substring(1));        	
        	
      //  	System.out.println("ATTACKING " + row + "" + col);
        	
        	if(board[row][col] == 1) {
        		System.out.println("You hit a wumpus!");
        		wumpuses.remove(attack);
        		board[row][col] = 0;
   //     		System.out.println("REMOVING " + attack);
   //     	    System.out.println("WUMPUSES REMAINING: " + (wumpuses.size()));
        	}

        	
        	// Distance checking
        	int min = 99;
        	for(int i = 0; i < wumpuses.size(); i++) {
        		
        		String wumpus = wumpuses.get(i);
		
            	int rowWum = Integer.parseInt(wumpus.substring(0, 1));
            	int colWum = Integer.parseInt(wumpus.substring(1));
    			
            	int dist = Math.abs(row - rowWum) + Math.abs(col - colWum);
            	if(dist < min) {
            		min = dist;
            	}
                	
        	}

        	count++;
        	
        	if(wumpuses.size() > 0) {
        		System.out.println(min);
        	}else {
        		System.out.println("Your score is " + count + " moves.");     
        	}
        	
        }
        
    }    
    
}