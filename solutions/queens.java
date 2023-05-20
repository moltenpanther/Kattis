import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> queen = new HashMap<Integer, Integer>();
		HashSet<Integer> check = new HashSet<Integer>();
		
		boolean possible = true;
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if(queen.containsKey(x) || check.contains(y)) {
				possible = false;
				i = num;
			}else {
				queen.put(x, y);
				check.add(y);
			}	
		}
		
		if(possible) {
			
			for(int i = 0; i < num; i++) {
				
				int x = i;
				int y = queen.get(i);
				int z = y;
				
				for(int j = i; j < num; j++) {
					if((queen.get(j) == y || queen.get(j) == z) && j != i) {
						possible = false;
						i = num;
						j = num;
					}
					y++;	
					z--;
				}
				
			}

		}
		
		if(possible){
			System.out.println("CORRECT");
		}else {
			System.out.println("INCORRECT");
		}
		
		scan.close();
	}
	
}