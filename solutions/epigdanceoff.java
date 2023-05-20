import java.util.ArrayList;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		String[][] dance = new String[scan.nextInt()][scan.nextInt()];
		int count = 1;
		
		for(int i = 0; i < dance.length; i++) {
			String line = scan.next();
			for(int j = 0; j < dance[i].length; j++) {
				dance[i][j] = String.valueOf(line.charAt(j));
			}
		}
		for(int i = 0; i < dance[0].length; i++) {
			boolean blank = true;
			for(int j = 0; j < dance.length; j++) {
				if(dance[j][i].equals("$")) {
					j = dance.length;
					blank = false;
				}
			}
			if(blank) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}	
	
}	