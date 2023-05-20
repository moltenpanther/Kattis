import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int people = scan.nextInt();
		int chicken = scan.nextInt();
		String plur = "";
		
		if(chicken - people != 1 && people - chicken != 1) {
			plur = "s";
		}
		
		if(chicken > people) {
			System.out.println("Dr. Chaz will have " + (chicken - people) + " piece" + plur + " of chicken left over!");
		}else {
			System.out.println("Dr. Chaz needs " + (people - chicken) + " more piece" + plur + " of chicken!");
		}
		
		scan.close();
	}	
}