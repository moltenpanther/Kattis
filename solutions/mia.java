import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean gameover = false;
        while(!gameover) {        	
        	
	        int s1 = scan.nextInt();
	        int s2 = scan.nextInt();
	        int r1 = scan.nextInt();
	        int r2 = scan.nextInt();
	        
	        if(s1 + s2 + r1 + r2 != 0) {
		        
		        int sWin = 0;
		        int rWin = 0;        
		        
		        if((s1 == 1 && s2 == 2) || (s1 == 2 && s2 == 1)){
		        	sWin += 1000;
		        }else if(s1 == s2) {
		        	sWin += ((s1 * 10) + s2) * 10;
		        }else {
		        	if(s1 > s2) {
		        		sWin = s1 * 10 + s2;
		        	}else {
		        		sWin = s2 * 10 + s1;
		        	}
		        }
		        
		        if((r1 == 1 && r2 == 2) || (r1 == 2 && r2 == 1)){
		        	rWin += 1000;
		        }else if(r1 == r2) {
		        	rWin += ((r1 * 10) + r2) * 10;
		        }else {
		        	if(r1 > r2) {
		        		rWin = r1 * 10 + r2;
		        	}else {
		        		rWin = r2 * 10 + r1;
		        	}
		        }
		        
		        if(sWin > rWin) {
		        	System.out.println("Player 1 wins.");
		        }else if(rWin > sWin) {
		        	System.out.println("Player 2 wins.");
		        }else {
		        	System.out.println("Tie.");
		        }
	        }else {
	        	gameover = true;
	        }
        
        }
        
        scan.close();
    }
    
}
