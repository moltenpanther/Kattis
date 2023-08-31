import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = Integer.parseInt(br.readLine());
        for(int i = 0; i < cases; i++) {
        	
        	br.readLine();
        	
        	// Loading and processing number input
        	String[] numMonsters = br.readLine().split(" ");
        	int numGodz = Integer.parseInt(numMonsters[1]);
        	int numMech = Integer.parseInt(numMonsters[0]);
        	
        	String[] armyGodzStr = br.readLine().split(" ");
        	int[] armyGodz = new int[armyGodzStr.length];
        	for(int j = 0; j < armyGodzStr.length; j++) {
        		armyGodz[j] = Integer.parseInt(armyGodzStr[j]);
        	}
        	String[] armyMechStr = br.readLine().split(" ");
        	int[] armyMech = new int[armyMechStr.length];
        	for(int j = 0; j < armyMechStr.length; j++) {
        		armyMech[j] = Integer.parseInt(armyMechStr[j]);
        	}
        	
        	// Sorting
        	Arrays.sort(armyGodz);
        	Arrays.sort(armyMech);
        	
        	// Fight!
        	int iGodz = 0;
        	int iMech = 0;
        	        	
        	while(iMech < armyMech.length && iGodz < armyGodz.length) {
        		if(armyMech[iMech] <= armyGodz[iGodz]) {
        			iMech++;        			
        		}else {
        			iGodz++;
        		}	
        	}
        	
            // Output
        	if(iMech == armyMech.length) {
        		System.out.println("Godzilla");          		
        	}else {
        		System.out.println("MechaGodzilla");
        	}
        	
        }
            
        br.close();
    }

}
