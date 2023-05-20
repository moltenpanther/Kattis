import java.util.PriorityQueue;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			queue.add(scan.nextInt());
		}
		queue.add(90001);
		
		int card = 0;
		int score = 0;
		for(int i = 0; i < num; i++) {
			if(i == 0) {
				card = queue.peek();
				score += queue.remove();				
			}else if(queue.peek() - card == 1) {
				card = queue.peek();
				queue.remove();
			}else {
				card = queue.peek();
				score += queue.remove();
			}	
		}
		
		System.out.println(score);
		
		scan.close();
	}
	
}
