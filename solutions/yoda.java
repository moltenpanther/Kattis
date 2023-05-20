import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String num1 = scan.next();
		String num2 = scan.next();
		
		int dif = Math.abs(num1.length() - num2.length());
		if(num1.length() < num2.length()) {
			num1 = equalize(num1, dif);
		}else if(num2.length() < num1.length()) {
			num2 = equalize(num2, dif);
		}
		
		String ans1 = "";
		String ans2 = "";
		
		for(int i = 0; i < num1.length(); i++){
			
			int n1 = Character.getNumericValue(num1.charAt(i));
			int n2 = Character.getNumericValue(num2.charAt(i));
			
			if(n1 == n2) {
				ans1 += String.valueOf(n1);
				ans2 += String.valueOf(n2);
			}else if(n1 < n2) {
				ans2 += String.valueOf(n2);
			}else {
				ans1 += String.valueOf(n1);				
			}
		}
		
		if(ans1 == "") {
			System.out.println("YODA");
		}else {
			System.out.println(Integer.valueOf(ans1));
		}
		
		if(ans2 == "") {
			System.out.println("YODA");
		}else {
			System.out.println(Integer.valueOf(ans2));
		}
		
	}
	
	public static String[] num2Array(String x) {
		String[] num = new String[x.length()];
		for(int i = 0; i < x.length(); i++) {
			num[i] = String.valueOf(x.charAt(i));
		}
		return num;
	}
	
	public static String equalize(String x, int dif) {
		
		String ans = "";
		for(int i = 0; i < dif; i++) {
			ans += "0";
		}
		ans += x;
		return ans;
	}
	
}
