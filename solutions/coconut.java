import java.util.ArrayList;
import java.util.Scanner;

public class coconut {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int syl = scan.nextInt();
		int players = scan.nextInt();

		int[] hands = new int[players * 2 + 1];
		int[] winner = new int[players + 1];

		int count = 0;
		int remaining = players;
		
		for(int i = 1; remaining > 1; i++) {
			
			boolean split = false;
			
			// Counting
			// Both or Left
			if(hands[i] == 0 && i % 2 != 0) {
				count++;
			}else if(hands[i] == 1 || hands[i] == 2) {
				count++;
			}
			
			// Punishment
			if(count >= syl) {
				hands[i]++;
				if(hands[i] == 1) {
					hands[i + 1]++;
					split = true;
				}
				
				if(i % 2 != 0) {
					if(hands[i] > 2 && hands[i + 1] > 2) {
						remaining--;
						winner[(i + 1) / 2]++;
					}					
				}else {
					if(hands[i - 1] > 2 && hands[i] > 2) {
						remaining--;
						winner[i / 2]++;
					}
				}
				
				count = 0;
			}
			
			if(split) {
				i--;
			}
						
			if(i >= hands.length - 1) {
				i = 0;
			}
		}
		
		for(int i = 1; i < winner.length; i++) {
			if(winner[i] == 0) {
				System.out.println(i);				
			}
		}
			
		scan.close();
	}
	
}