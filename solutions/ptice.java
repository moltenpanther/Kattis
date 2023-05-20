import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String adrian = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabca";
		String bruno = "babcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabcbabc";
		String goran = "ccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaabbccaa";

		int countA = 0;
		int countB = 0;
		int countG = 0;

		int length = scan.nextInt();
		String key = scan.next().toLowerCase();

		// Adrian
		for (int i = 0; i <= length - 1; i++) {

			if (adrian.charAt(i) == key.charAt(i)) {
				countA++;
			}
		}
		// Bruno
		for (int i = 0; i <= length - 1; i++) {

			if (bruno.charAt(i) == key.charAt(i)) {
				countB++;
			}
		}
		// Goran
		for (int i = 0; i <= length - 1; i++) {

			if (goran.charAt(i) == key.charAt(i)) {
				countG++;
			}
		}

		if (countA == countB && countA == countG) {
			System.out.println(countA + "\nAdrian\nBruno\nGoran");
		} else if (countA > countB && countA > countG) {
			System.out.println(countA + "\nAdrian");
		} else if (countB > countA && countB > countG) {
			System.out.println(countB + "\nBruno");
		} else if (countG > countA && countG > countB) {
			System.out.println(countG + "\nGoran");
		} else if (countA == countB && countA > countG) {
			System.out.println(countA + "\nAdrian\nBruno");
		} else if (countA == countG && countA > countB) {
			System.out.println(countA + "\nAdrian\nGoran");
		} else if (countB == countG && countB > countA) {
			System.out.println(countB + "\nBruno\nGoran");
		}

		scan.close();

	}

}