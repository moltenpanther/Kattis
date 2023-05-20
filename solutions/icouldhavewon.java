import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Integer> wins = new ArrayList<Integer>();
        String games = scan.next();
        
        for(int i = 0; i <= games.length(); i++) {
        	
        	int countWinA = 0;
        	int countWinB = 0;        	     	
        	int countGameA = 0;
        	int countGameB = 0;
        	
        	for(int j = 0; j < games.length(); j++) {
        		
        		char win = games.charAt(j);
        		if(win == 'A') {
        			countGameA++;
        		}else {
        			countGameB++;
        		}
        		
        		if(countGameA == i) {
        			countWinA++;
        			countGameA = 0;
        			countGameB = 0;
        		}
        		if(countGameB == i) {
        			countWinB++;
        			countGameA = 0;
        			countGameB = 0;
        		}
        		
        	}

        	
        	if(countWinA > countWinB) {
        		wins.add(i);
        	}
        	
        	countWinA = 0;
        	countWinB = 0;
        	countGameA = 0;
        	countGameB = 0;
        	
        }
             
        System.out.println(wins.size());
        for(int i = 0; i < wins.size(); i++) {
        	System.out.print(wins.get(i) + " ");
        }
        
        scan.close();
    }
    
}