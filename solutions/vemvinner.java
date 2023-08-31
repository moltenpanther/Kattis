import java.util.Scanner;

public class vemvinner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        char[][] board = new char[3][3];
        for(int i = 0; i < 3; i++) {
        	for(int j = 0; j < 3; j++) {
            	board[i][j] = scan.next().charAt(0);
            }
        }
        
        boolean johan = false;
        boolean abdullah = false;        

        // Check rows
        for(int i = 0; i < 3; i++) {
        	if(board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
        		if(board[i][0] == 'X') {
        			johan = true;
        		}else if(board[i][0] == 'O') {
        			abdullah = true;
        		}
        	}
        }
        
        // Check cols
        for(int i = 0; i < 3; i++) {
        	if(board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
        		if(board[0][i] == 'X') {
        			johan = true;
        		}else if(board[0][i] == 'O') {
        			abdullah = true;
        		}
        	}
        }
        
        // Check diags
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
    		if(board[1][1] == 'X') {
    			johan = true;
    		}else if(board[1][1] == 'O') {
    			abdullah = true;
    		}
        }
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
    		if(board[1][1] == 'X') {
    			johan = true;
    		}else if(board[1][1] == 'O') {
    			abdullah = true;
    		}
        }
        
        // Output
        String winner = "";
        if(johan && !abdullah) {
        	winner = "Johan";
        }else if(!johan && abdullah) {
        	winner = "Abdullah";
        }else {
        	winner = "ingen";
        }
        
        System.out.println(winner + " har vunnit");      
        
        scan.close();
    }

}
