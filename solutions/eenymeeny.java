import java.util.ArrayList;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Setting things up
		String[] rhyme = scan.nextLine().split(" ");
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> team1 = new ArrayList<>();
		ArrayList<String> team2 = new ArrayList<>();
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			names.add(scan.next());
		}
		
		//Picking Teams
		boolean first = true;
		int count = 0;
		while(names.size() > 0) {
			
			count += rhyme.length - 1;
			while(count > names.size() - 1) {
				count -= names.size();
			}
			if(first) {
				team1.add(names.get(count));
				first = false;
			}else {
				team2.add(names.get(count));
				first = true;
			}
			names.remove(count);
		}
		
		//Printing Output
		System.out.println(team1.size());
		for(int i = 0; i < team1.size(); i++) {
			System.out.println(team1.get(i));
		}
		
		System.out.println(team2.size());
		for(int i = 0; i < team2.size(); i++) {
			System.out.println(team2.get(i));
		}
		
		scan.close();
	}	
	
}	