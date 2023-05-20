import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] abcOld = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		String[] abcNew = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
		
		String input = scan.nextLine().toUpperCase();
		String ans = "";
		for(int i = 0; i < input.length(); i++) {
			boolean match = false;
			for(int j = 0; j < abcOld.length; j++) {
				if(String.valueOf(input.charAt(i)).equals(abcOld[j])) {
					ans += abcNew[j];
					j = abcOld.length;
					match = true;
				}
			}
			if(!match) {
				ans += input.charAt(i);
			}
		}
		
		System.out.println(ans);
		
		scan.close();
	}
}