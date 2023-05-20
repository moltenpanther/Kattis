import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String cards = scan.next();
		int length = cards.length();
		
		String allP = "";
		String allK = "";
		String allH = "";
		String allT = "";
		
		int P = 13;
		int K = 13;
		int H = 13;
		int T = 13;
		int count = 0;
		
		boolean repeat = false;
		
		for(int i = 0; i < length; i += 3) {
			String sub = cards.substring(i, i + 3);
			
			// Pcheck
			if(sub.contains("P")) {
				P--;
				
				if(allP.contains(sub)) {
					repeat = true;
				}
				allP += sub;
			}
			
			// Kcheck
			if(sub.contains("K")) {
				K--;
				
				if(allK.contains(sub)) {
					repeat = true;
				}
				allK += sub;
			}
			
			
			// Hcheck
			if(sub.contains("H")) {
				H--;
				
				if(allH.contains(sub)) {
					repeat = true;
				}
				allH += sub;
			}
			
			
			// Tcheck
			if(sub.contains("T")) {
				T--;
				
				if(allT.contains(sub)) {
					repeat = true;
				}
				allT += sub;
			}
			
		}	
			
		if(repeat) {
			System.out.print("GRESKA");
		}else {
			System.out.print(P + " " + K + " " + H + " " + T);
		}
		
		scan.close();
		
	}

}