import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
				
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int aMb = a * b;
		int cMd = c * d;
		int aAb = a + b;
		int cAd = c + d;
		int aSb = a - b;
		int cSd = c - d;
		
		int aDb = 10001;
		int cDd = -10005;

		if(b == 0 || d == 0) {
		
		}else {			
			aDb = a / b;
			cDd = c / d;
		}
		
		boolean check = false;
		if(aMb == cMd) {
			System.out.println(a + " * " + b + " = " + c + " * " + d);
			check = true;
		}
		if(aMb == cAd) {
			System.out.println(a + " * " + b + " = " + c + " + " + d);
			check = true;
		}
		if(aMb == cSd) {
			System.out.println(a + " * " + b + " = " + c + " - " + d);
			check = true;
		}
		if(aMb == cDd) {
			System.out.println(a + " * " + b + " = " + c + " / " + d);
			check = true;
		}

		if(aAb == cMd) {
			System.out.println(a + " + " + b + " = " + c + " * " + d);
			check = true;
		}
		if(aAb == cAd) {
			System.out.println(a + " + " + b + " = " + c + " + " + d);
			check = true;
		}
		if(aAb == cSd) {
			System.out.println(a + " + " + b + " = " + c + " - " + d);
			check = true;
		}
		if(aAb == cDd) {
			System.out.println(a + " + " + b + " = " + c + " / " + d);
			check = true;
		}
		
		if(aSb == cMd) {
			System.out.println(a + " - " + b + " = " + c + " * " + d);
			check = true;
		}
		if(aSb == cAd) {
			System.out.println(a + " - " + b + " = " + c + " + " + d);
			check = true;
		}
		if(aSb == cSd) {
			System.out.println(a + " - " + b + " = " + c + " - " + d);
			check = true;
		}
		if(aSb == cDd) {
			System.out.println(a + " - " + b + " = " + c + " / " + d);
			check = true;
		}
		
		if(aDb == cMd) {
			System.out.println(a + " / " + b + " = " + c + " * " + d);
			check = true;
		}
		if(aDb == cAd) {
			System.out.println(a + " / " + b + " = " + c + " + " + d);
			check = true;
		}
		if(aDb == cSd) {
			System.out.println(a + " / " + b + " = " + c + " - " + d);
			check = true;
		}
		if(aDb == cDd) {
			System.out.println(a + " / " + b + " = " + c + " / " + d);
			check = true;
		}
		
		if(!check) {
			System.out.println("problems ahead");
		}
		
	}
	
}
