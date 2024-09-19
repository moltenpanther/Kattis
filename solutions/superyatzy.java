import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class superyatzy {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int cheat = Integer.parseInt(line[1]);
        
        int[] dice = new int[7];
        for(int i = 0; i < num; i++) {
        	int die = Integer.parseInt(br.readLine());
        	dice[die]++;
        }
        
        int max = -1;
        for(int i = 1; i <= 6; i++) {
        	if(dice[i] > max) {
        		max = dice[i];
        	}
        }
        
        // Output
        if(max + cheat < num) {
        	System.out.println("Nej");
        }else {
        	System.out.println("Ja");
        }
   		
    	br.close();
    }

}
