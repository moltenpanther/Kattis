import java.util.Scanner;

public class onedfroggereasy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int start = scan.nextInt();
		int goal = scan.nextInt();
		
		int[] square = new int[num];
		for(int i = 0; i < num; i++) {
			square[i] = scan.nextInt();
		}
		
		int here = start - 1;
		int[] visited = new int[num];
		
		String fate = "";
		int count = 0;
		boolean good = true;
		while(good) {
			
			int hop = square[here];
			if(hop == goal) {
				good = false;
				fate = "magic";
			}else {	
				if(visited[here] == 1) {
					good = false;
					fate = "cycle";
				}else {	
					
					visited[here] = 1;
					count++;
					
					if(here + hop < 0) {
						good = false;
						fate = "left";
					}else if(here + hop >= num) {
						good = false;
						fate = "right";
					}else {
						here += hop;
					}
				} 
			}
		}
		
		System.out.println(fate + "\n" + count);

		scan.close();
	}

}
