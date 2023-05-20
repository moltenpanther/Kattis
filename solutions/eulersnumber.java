import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
	
		double num = scan.nextInt();
		double sum = 0;
		for(int i = 0; i <= num; i++) {
			sum += 1 / factorial(i);	
		}
		System.out.println(sum);
		scan.close();
	}
	
	public static double factorial(double n) {
		if(n == 1 || n == 0) {
			return 1;
		}else{
			return n * factorial(n - 1);
		}
	}
}
