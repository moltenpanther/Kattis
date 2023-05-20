import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int king = scan.nextInt();
    	int queen = scan.nextInt();
    	int rook = scan.nextInt();
    	int bishop = scan.nextInt();
    	int knight = scan.nextInt();
    	int pawn = scan.nextInt();
    	
    	int kingX = 0;
    	int queenX = 0;
    	int rookX = 0;
    	int bishopX = 0;
    	int knightX = 0;
    	int pawnX = 0;
    	
	    	if(king == 1) {
	    		kingX = 0;
	    	}else {
	    		kingX = 1 - king;
	    	}
    	
	    	if(queen == 1) {
	    		queenX = 0;
	    	}else {
	    		queenX = 1 - queen;
	    	}
	    	
	    	if(rook == 2) {
	    		rookX = 0;
	    	}else {
	    		rookX = 2 - rook;
	    	}
	    	if(bishop == 2) {
	    		bishopX = 0;
	    	}else {
	    		bishopX = 2 - bishop;
	    	}
	    	if(knight == 2) {
	    		knightX = 0;
	    	}else {
	    		knightX = 2 - knight;
	    	}
	    	if(pawn == 8) {
	    		pawnX = 0;
	    	}else {
	    		pawnX = 8 - pawn;
	    	}
    	
	    System.out.print(kingX + " " + queenX + " " + rookX + " " + bishopX + " " + knightX + " " + pawnX);
    	
        scan.close();
    }
}