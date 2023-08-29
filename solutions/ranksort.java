import java.util.LinkedList;
import java.util.Scanner;

public class ranksort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int teamNum = Integer.parseInt(scan.next());
        int games = Integer.parseInt(scan.next());
        
        // Index is team, value is rank
        LinkedList<Integer> teams = new LinkedList<Integer>();
        for(int i = 1; i <= teamNum; i++) {
        	teams.add(i);
        }
        
        // Going through the games
        for(int i = 0; i < games; i++) {
        	
        	int won = Integer.parseInt(scan.next().substring(1));
        	int lost = Integer.parseInt(scan.next().substring(1));
        	
        	// Searching for winner/loser
        	for(int j = 0; j < teams.size(); j++) {
            	
            	int team = teams.get(j);
            	if(team == lost) {
            		
            		int loser = teams.remove(j);
            		// Searching for winner if lost was found first
            		for(int k = j; k < teams.size(); k++) {
            			
            			team = teams.get(k);
            			if(team == won) {
            				teams.add(k + 1, loser);
            				j = teams.size();
            				k = teams.size();
            			}
            		}
            		
            	}else if(team == won) {
            		j = teams.size();
            	}
            	
            }

        }
        
        // Output
        for(int team : teams) {
        	System.out.printf("T%d ", team);        	
        }
        
        scan.close();
    }

}
