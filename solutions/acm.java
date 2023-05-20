import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean switchy = true;
		int time = 0;
		int correct = 0;
		int total = 0;
		String incorr = "";
		
		while(switchy) {
			time = scan.nextInt();
			if(time >= 0) {
				String problem = scan.next();
				String check = scan.next();
				
				if(check.equals("right")) {
					correct++;
					int count = 0;
					for(int i = 0; i < incorr.length(); i++) {
						if(incorr.charAt(i) == problem.charAt(0)) {
							count += 20;
						}	
					}
					total += time + count;
				}else {
					incorr += problem;
				}
					
			}else {
				System.out.println(correct + " " + total);
				switchy = false;				
			}
		}
		scan.close();
	}
}