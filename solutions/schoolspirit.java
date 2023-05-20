import java.util.Arrays;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		double[] score = new double[num];
		
		for(int i = 0; i < num; i++) {
			score[i] = scan.nextInt();
		}
		
		double group = 0;
		for(int i = 0; i < num; i++) {
			group += score[i] * Math.pow((.8), i);			
		}
		double sum = 0;
		for(int i = 0; i < num; i++) {
			int exp = 0;
			double minusOne = 0;
			for(int j = 0; j < num; j++) {
				if(i != j) {
					minusOne += score[j] * Math.pow((.8), exp);			
					exp++;
				}
			}
			sum += minusOne;
		}
			
		System.out.println(group / 5);
		System.out.println(sum / 5 / num);
		scan.close();
	}
}