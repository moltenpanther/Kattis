import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String circle =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
				
		int num = Integer.valueOf(scan.nextLine());
		double step = 60 * 3.14159265359 / 28;
		for(int i = 0; i < num; i++) {
			
			String phrase = scan.nextLine();
			double count = 0;
			double time = 0;
			for(int j = 0; j < phrase.length() - 1; j++) {
				
				char let1 = phrase.charAt(j);
				char let2 = phrase.charAt(j + 1);
				int pos1 = circle.indexOf(let1);
				int pos2 = circle.indexOf(let2);
				int dif = pos1 - pos2;
				
				if(dif < 0) {
					dif *= -1;
				}
				
				if(dif > 14) {
					dif = 28- dif;
				}else {
					
				}
				
				count += dif;				
			}
	
			time = (count * step / 15) + phrase.length();
			System.out.println(time);
			
		}		
		scan.close();
	}

}