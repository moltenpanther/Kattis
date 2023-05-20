import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			
			int tot = scan.nextInt();			
			int sum = 0;
			int[] grade = new int[tot];
			for(int j = 0; j < tot; j++) {
				grade[j] = scan.nextInt();
				sum += grade[j];
			}
			
			double avg = sum / tot;
			double count = 0;
			
			for(int j = 0; j < grade.length; j++) {
				if(grade[j] > avg) {
					count++;
				}
			}

			double ans = 100 * count / tot;
			
			System.out.printf("%.3f", ans);
			System.out.print("%");
			System.out.println();
			
		}
		
		scan.close();
	}
	
}
