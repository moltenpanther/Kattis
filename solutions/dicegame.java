import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double ga1 = scan.nextInt();
		double gb1 = scan.nextInt();
		double ga2 = scan.nextInt();
		double gb2 = scan.nextInt();

		double gunnar = ((ga1 + gb1 + ga2 + gb2) / 2);

		double ea1 = scan.nextInt();
		double eb1 = scan.nextInt();
		double ea2 = scan.nextInt();
		double eb2 = scan.nextInt();

		double emma = ((ea1 + eb1 + ea2 + eb2) / 2);

		if (gunnar > emma) {
			System.out.println("Gunnar");
		} else if (emma > gunnar) {
			System.out.println("Emma");
		} else {
			System.out.println("Tie");
		}

		scan.close();
	}

}