import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dog1Aggro = scan.nextInt();
		int dog1Calm = scan.nextInt();
		int dog2Aggro = scan.nextInt();
		int dog2Calm = scan.nextInt();
		
		int post = scan.nextInt();
		int milk = scan.nextInt();
		int garb = scan.nextInt();
		
		System.out.println(ans(dogScaryCheck(dog1Aggro, dog1Calm, post), dogScaryCheck(dog2Aggro, dog2Calm, post)));
		System.out.println(ans(dogScaryCheck(dog1Aggro, dog1Calm, milk), dogScaryCheck(dog2Aggro, dog2Calm, milk)));
		System.out.println(ans(dogScaryCheck(dog1Aggro, dog1Calm, garb), dogScaryCheck(dog2Aggro, dog2Calm, garb)));
		
		scan.close();
	}
	
	public static boolean dogScaryCheck(int aggro, int calm, int man) {
		boolean aggroDog = false;
		int aggroTot = aggro;
		int calmTot = aggro + calm;
		for(int i = 0; i < man; i++) {
			if(i >= calmTot) {
				aggroTot += calm + aggro;
				calmTot += aggro + calm;
			}

			if(i < aggroTot) {
				aggroDog = true;
			}else if(i < calmTot) {
				aggroDog = false;
			}
		}

		if(aggroDog) {
			return true;
		}else {
			return false;
		}		
	}
	
	public static String ans(boolean dog1, boolean dog2) {
		
		if(dog1 && dog2) {
			return "both";
		}else if(dog1 || dog2) {
			return "one" ;
		}else {
			return "none" ;
		}		
	}
}	