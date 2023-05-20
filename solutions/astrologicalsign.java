import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int classmates = scan.nextInt();

		for (int i = 1; i <= classmates; i++) {

			int day = scan.nextInt();
			String mon = scan.next();

			if (mon.equals("Mar")) {
				if (day <= 20) {
					System.out.println("Pisces");
				} else {
					System.out.println("Aries");
				}
			} else if (mon.equals("Apr")) {
				if (day <= 20) {
					System.out.println("Aries");
				} else {
					System.out.println("Taurus");
				}
			} else if (mon.equals("May")) {
				if (day <= 20) {
					System.out.println("Taurus");
				} else {
					System.out.println("Gemini");
				}
			} else if (mon.equals("Jun")) {
				if (day <= 21) {
					System.out.println("Gemini");
				} else {
					System.out.println("Cancer");
				}
			} else if (mon.equals("Jul")) {
				if (day <= 22) {
					System.out.println("Cancer");
				} else {
					System.out.println("Leo");
				}
			} else if (mon.equals("Aug")) {
				if (day <= 22) {
					System.out.println("Leo");
				} else {
					System.out.println("Virgo");
				}
			} else if (mon.equals("Sep")) {
				if (day <= 21) {
					System.out.println("Virgo");
				} else {
					System.out.println("Libra");
				}
			} else if (mon.equals("Oct")) {
				if (day <= 22) {
					System.out.println("Libra");
				} else {
					System.out.println("Scorpio");
				}
			} else if (mon.equals("Nov")) {
				if (day <= 22) {
					System.out.println("Scorpio");
				} else {
					System.out.println("Sagittarius");
				}
			} else if (mon.equals("Dec")) {
				if (day <= 21) {
					System.out.println("Sagittarius");
				} else {
					System.out.println("Capricorn");
				}
			} else if (mon.equals("Jan")) {
				if (day <= 20) {
					System.out.println("Capricorn");
				} else {
					System.out.println("Aquarius");
				}
			} else if (mon.equals("Feb")) {
				if (day <= 19) {
					System.out.println("Aquarius");
				} else {
					System.out.println("Pisces");
				}

			}

		}

		scan.close();

	}

}