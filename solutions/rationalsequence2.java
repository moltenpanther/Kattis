import java.util.Scanner;

public class rationalsequence2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			scan.nextInt();
			String[] inp = scan.next().split("/");
			int p = Integer.parseInt(inp[0]);
			int q = Integer.parseInt(inp[1]);
			
			String dir = "";
			int count = 0;
			
			while(p != q) {
				
				if(p > q) {
					p -= q;
					dir += "R";
				}else {
					q -= p;
					dir += "L";
				}
				count++;
			}
			
			int ans = 1;
			for(int j = dir.length() - 1; j >= 0; j--) {
				ans *= 2;
				char ch = dir.charAt(j);
				if(ch == 'R') {
					ans++;
				}
			}
			
			System.out.println((i + 1) + " " + ans);
		}
		
		scan.close();
	}
	
}