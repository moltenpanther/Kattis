import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		String input = scan.nextLine() + " ";
		double count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			
			if(input.charAt(i) == ' ') {
				count++;
			}
		}
		
		double ae = 0;
		int pos1 = 0;
		int pos2 = 0;

		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				pos2 = i;
				if(input.substring(pos1, pos2).contains("ae")){
					ae++;
				}
				pos1 = pos2 + 1;
			}
		}
		
		double perc = (ae / count) * 100;
		if(perc >= 40) {
			System.out.println("dae ae ju traeligt va");
		}else {
			System.out.println("haer talar vi rikssvenska");
		}
		
		scan.close();
	}
}