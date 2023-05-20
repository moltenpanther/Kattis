import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashMap<String, String> list = new HashMap<String, String>();
		HashMap<String, Integer> votes = new HashMap<String, Integer>();
		
		int num = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < num; i++) {
			
			String name = scan.nextLine();
			String party = scan.nextLine();
			list.put(name, party);
		}
		
		String winner = "";
		int max = -1;
		
		boolean tie = true;
		num = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < num; i++) {
			String vote = scan.nextLine();
			if(list.containsKey(vote)) {
				
				if(votes.containsKey(vote)) {
					int count = votes.get(vote) + 1;
					votes.put(vote, count);
					if(count == max) {
						tie = true;
					}else if(count > max) {
						max = count;
						tie = false;
						winner = vote;
					}
				}else {
					votes.put(vote, 1);	
					if(1 == max) {
						tie = true;
					}else if(1 > max) {
						max = 1;
						tie = false;
						winner = vote;
					}
				}
				
			}
		}
		
		if(tie) {
			System.out.println("tie");
		}else {
			System.out.println(list.get(winner));
		}
		
		scan.close();
	}
	
}
