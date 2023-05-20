import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int day = scan.nextInt();
		int month = scan.nextInt();
		int end = 0;

		if (month == 2) {
			day += 31;
		} else if (month == 3) {
			day += 59;
		} else if (month == 4) {
			day += 90;
		} else if (month == 5) {
			day += 120;
		} else if (month == 6) {
			day += 151;
		} else if (month == 7) {
			day += 181;
		} else if (month == 8) {
			day += 212;
		} else if (month == 9) {
			day += 243;
		} else if (month == 10) {
			day += 273;
		} else if (month == 11) {
			day += 304;
		} else if (month == 12) {
			day += 334;
		}

		end = day % 7;

		if (end == 0) {
			System.out.print("Wednesday");
		} else if (end == 1) {
			System.out.print("Thursday");
		} else if (end == 2) {
			System.out.print("Friday");
		} else if (end == 3) {
			System.out.print("Saturday");
		} else if (end == 4) {
			System.out.print("Sunday");
		} else if (end == 5) {
			System.out.print("Monday");
		} else {
			System.out.print("Tuesday");
		}

		scan.close();
	}

}