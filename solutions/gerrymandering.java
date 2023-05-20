import java.util.HashMap;
import java.util.Scanner;

public class gerrymandering {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> votesA = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> votesB = new HashMap<Integer, Integer>();
				
		int precincts = scan.nextInt();
		int districts = scan.nextInt();
		int totalVotes = 0;
		
		for(int i = 0; i < precincts; i++) {
			
			int dis = scan.nextInt();
			int forA = scan.nextInt();
			int forB = scan.nextInt();
			
			totalVotes += forA + forB;
			
			if(!votesA.containsKey(dis)) {
				votesA.put(dis, forA);
				votesB.put(dis, forB);
			}else {
				votesA.replace(dis, votesA.get(dis), votesA.get(dis) + forA);
				votesB.replace(dis, votesB.get(dis), votesB.get(dis) + forB);
			}
		}
		
		int totalWastedA = 0;
		int totalWastedB = 0;
		
		for(int i = 1; i <= districts; i++) {
			
			int forA = votesA.get(i);
			int forB = votesB.get(i);
			
			int wastedA = 0;
			int wastedB = 0;
			
			if(forA > forB) {
				wastedA = forA - ((forA + forB) / 2 + 1);
				wastedB = forB;
				System.out.println("A " + wastedA + " " + wastedB);
			}else {				
				wastedA = forA;
				wastedB = forB - ((forA + forB) / 2 + 1);	
				System.out.println("B " + wastedA + " " + wastedB);
			}
			
			totalWastedA += wastedA;
			totalWastedB += wastedB;
		}
		
		double eff = (double)Math.abs(totalWastedA - totalWastedB) / totalVotes;
		
				System.out.printf("%.10f", eff);
		
		scan.close();
	}
	
}