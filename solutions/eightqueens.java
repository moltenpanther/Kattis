import java.util.Scanner;

public class eightqueens {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        char[][] board = new char[8][8];
        
        int[] rows = new int[8];
        int[] cols = new int[8];

        // Checking stars
        for(int i = 0; i < 8; i++) {
            
            String row = scan.next();
            for(int j = 0; j < 8; j++) {
                
                board[i][j] = row.charAt(j);
                if(row.charAt(j) == '*') {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        
        // Check for one in each row/col
        boolean good = true;
        for(int i = 0; i < 8; i++) {
            if(rows[i] != 1 || cols[i] != 1) {
                good = false;
                break;
            }
        }
        
        // Check for no adjacency
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                
                if(board[i][j] == '*') {
                	
                	// Check Left Diagonal
                	int h = i;
                	int k = j;
                	while(h + 1 < 8 && k - 1 >= 0) {
                		
                		h++;
                		k--;
                		
            			if(board[h][k] == '*') {
            				good = false;
            				i = 8;
            				j = 8;
            				break;
            			}
                	}
                	
                	// Check Right Diagonal
                	h = i;
                	k = j;
                	while(h + 1 < 8 && k + 1 < 8) {
                		
                		h++;
                		k++;
                		
            			if(board[h][k] == '*') {
            				good = false;
            				i = 8;
            				j = 8;
            				break;
            			}
                	}
                }
            }
        }
        
        // Output
        if(good) {
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }

        scan.close();
    }
       
}

