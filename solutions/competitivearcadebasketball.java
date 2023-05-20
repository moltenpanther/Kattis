import java.util.HashMap;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		
		int players = Integer.parseInt(scan.next());
		int toWin = Integer.parseInt(scan.next());
		int lines = Integer.parseInt(scan.next());
		boolean winner = false;
		
		for(int i = 0; i < players; i++) {
			map.put(scan.next(), 0);
		}
		
		for(int i = 0; i < lines; i++) {
			String name = scan.next();
			int num1 = Integer.parseInt(scan.next());
			
			if(map.containsKey(name)) {
				int num2 = map.get(name);
				int sum = num1 + num2;
				map.put(name, sum);
				if(sum >= toWin) {
					System.out.println(name + " wins!");
					map.remove(name);
					winner = true;
				}
			}
		}
		
		if(!winner) {
			System.out.println("No winner!");
		}
		
		scan.close();
	}
	
}
