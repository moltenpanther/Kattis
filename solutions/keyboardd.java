import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String good = scan.nextLine();
		String bad = scan.nextLine();
		
		String checked = "";
		String ans = "";
		
		for(int i = 0; i < good.length(); i++) {
			
			String check = good.substring(i, i + 1);
			if(!checked.contains(check)) {
				
				checked += check;
				
				int goodNum = 0;
				int badNum = 0;
				for(int j = i; j < good.length(); j++) {
					if(good.substring(j, j + 1).equals(check)) {
						goodNum++;
					}
				}
				for(int j = i; j < bad.length(); j++) {
					if(bad.substring(j, j + 1).equals(check)) {
						badNum++;
					}
				}
				
				if(badNum > goodNum) {
					ans += check;
				}
			}
		}
		System.out.println(ans);
	}
	
}
