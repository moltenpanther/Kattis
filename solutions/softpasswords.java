import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String stored = scan.next();
    	String typed = scan.next();
    	int dif = Math.abs(stored.length() - typed.length());
    	
    	boolean nums = false;
    	boolean caps = false;
    	
    	if(stored.equals(typed)) {
    		nums = true;
    	}else if(dif == 1) {
    		nums = checkNum(stored, typed);
    	}else if(dif == 0){
    		caps = checkCaps(stored, typed);
    	}
    	
    	if(nums ^ caps) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    	    	
    	scan.close();
	}
	
	public static boolean checkNum(String stored, String typed){
		
		int start = (int) stored.charAt(0);
		int end = (int) stored.charAt(stored.length() - 1);
		if(start > 47 && start < 58) {				
			if(typed.equals(stored.substring(1))) {
				return true;
			}
		}
		if(end > 47 && end < 58) {
			if(typed.equals(stored.substring(0, stored.length() - 1))) {
				return true;
			}
		}	
		return false;
	}
	
	public static boolean checkCaps(String stored, String typed) {
		
		String ans = "";
		for(int i = 0; i < typed.length(); i++) {
			int let = (int) typed.charAt(i);
			if(let > 96 && let < 123) {
				let -= 32;
			}else if(let > 64 && let < 91) {
				let += 32;
			}

			ans += (char) let;			
		}
		if(stored.equals(ans)) {
			return true;
		}
		
		return false;
	}
	
}