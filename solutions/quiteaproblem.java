import java.util.Scanner;

public class Kattis {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String line = "";
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			if(line.toLowerCase().contains("problem")) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		scan.close();
	}
	
}
