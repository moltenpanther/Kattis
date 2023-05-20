import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Setting things up
		String[] ascii = {"xxxxxx...xx...xx...xx...xx...xxxxxx", //0
						  "....x....x....x....x....x....x....x", //1
						  "xxxxx....x....xxxxxxx....x....xxxxx", //2
						  "xxxxx....x....xxxxxx....x....xxxxxx", //3
						  "x...xx...xx...xxxxxx....x....x....x", //4
						  "xxxxxx....x....xxxxx....x....xxxxxx", //5
						  "xxxxxx....x....xxxxxx...xx...xxxxxx", //6
						  "xxxxx....x....x....x....x....x....x", //7
						  "xxxxxx...xx...xxxxxxx...xx...xxxxxx", //8
						  "xxxxxx...xx...xxxxxx....x....xxxxxx", //9
						  ".......x....x..xxxxx..x....x......."};//+
		
		String line1 = scan.next();
		String line2 = scan.next();
		String line3 = scan.next();
		String line4 = scan.next();
		String line5 = scan.next();
		String line6 = scan.next();
		String line7 = scan.next();	
		
		//Single Line
		String equation = "";
		for(int i = 0; i < line1.length(); i += 6) {
			String full = line1.substring(i, i + 5) + line2.substring(i, i + 5) + line3.substring(i, i + 5) + line4.substring(i, i + 5) + line5.substring(i, i + 5) + line6.substring(i, i + 5) + line7.substring(i, i + 5);
			//Translating to decimal
			for(int j = 0; j < ascii.length; j++) {
				if(full.equals(ascii[j])) {
					int pos = j;
					if(j < 10) {
						equation += j;						
						j = ascii.length;
					}else {
						equation += "+";
						j = ascii.length;
					}
				}
			}
		}
				
		//String to integer
		int num1 = Integer.parseInt(equation.substring(0, equation.indexOf("+")));
		int num2 = Integer.parseInt(equation.substring(equation.indexOf("+") + 1, equation.length()));
		String sum = String.valueOf(num1 + num2);
				
		//Going from decimal to ASCII
		int count = 0;	
		String[] toASCII = new String[sum.length()];
		
		for(int i = 0; i < sum.length(); i++) {
			for(int j = 0; j < ascii.length; j++) {
				if(Integer.parseInt(sum.charAt(i) + "") == j) {
					toASCII[i] = ascii[j];
					j = ascii.length;
				}	
			}
		}
		
		//Printing it out
		for(int i = 0; i < toASCII[0].length(); i += 5) {
			String ans = "";
			for(int j = 0; j < toASCII.length; j++) {
				ans += toASCII[j].substring(i, i + 5) + ".";
			}
			System.out.print(ans.substring(0, ans.length() - 1));
			System.out.println();
		}
		
		
		
			
		scan.close();
	}	
}	