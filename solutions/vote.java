import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		for(int i = 0; i < num; i++) {
			
			int num2 = scan.nextInt();
			int sum = 0;
			int max = 0;
			int pos = 0;
			boolean same = false;
			for(int j = 1; j <= num2; j++) {
				int votes = scan.nextInt();
				sum += votes;
				if(votes >= max) {
					if(votes == max) {
						same = true;
					}else {
						same = false;
					}
					max = votes;
					pos = j;
				}
			}
			
			int half = sum / 2;
			
			if(same) {
				System.out.println("no winner");
			}else if(max > half) {
				System.out.println("majority winner " + pos);
			}else {
				System.out.println("minority winner " + pos);
			}
			
		}
		
		
		scan.close();
	}
	
}
