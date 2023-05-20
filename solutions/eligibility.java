import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cases = scan.nextInt();

		for (int i = 1; i <= cases; i++) {

			String name = scan.next();
			String coll = scan.next();
			String bday = scan.next();
			int courses = scan.nextInt();

			int collYear = Integer.valueOf(coll.substring(0, 4));
			int bdayYear = Integer.valueOf(bday.substring(0, 4));

			if (collYear >= 2010 || bdayYear >= 1991) {
				System.out.println(name + " eligible");
			}else if(courses >= 41) {
				System.out.println(name + " ineligible");
			}else {
				System.out.println(name + " coach petitions");
			}

		}

		scan.close();

	}

}