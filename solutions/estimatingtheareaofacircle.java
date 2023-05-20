import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double rad = scan.nextDouble();
		double tot = scan.nextDouble();
		double cir = scan.nextDouble();
		
		while(rad != 0) {
		
		double area = (3.14159265359 * Math.pow(rad, 2));
		double est = (cir / tot) * Math.pow(rad, 2) * 4;
		
		System.out.println(area + " " + est);

		rad = scan.nextDouble();
		tot = scan.nextDouble();
		cir = scan.nextDouble();
		}
		scan.close();
	}	
}