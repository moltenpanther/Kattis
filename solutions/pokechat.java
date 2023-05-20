import java.util.Scanner;

public class pokechat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String coded = scan.nextLine();
		String key = scan.nextLine();
		String ans = "";
		
		for(int i = 0; i < key.length(); i += 3) {
			
			int num = Integer.valueOf(key.substring(i, i + 3)) - 1;
			ans += coded.charAt(num);
		}
		
		System.out.println(ans);
		
	}
}