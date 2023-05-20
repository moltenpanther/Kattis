import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	    	
    	int num = Integer.parseInt(scan.nextLine());
    	for(int i = 0; i < num; i++) {
    		
    		String input = scan.nextLine();
    		if(input.charAt(0) == 'e') {
    			
    	    	int[] ascii = toNumbers(input.substring(2));
    	    	int[] encoded = encode(ascii);
    	    	toLetters(encoded);
    		
    		}else {
    		
    	    	int[] ascii = toNumbers(input.substring(2));
    	    	int[] decoded = decode(ascii);    			
    	    	toLetters(decoded);
    		}
    	}    	
    	scan.close();
    }
	
	public static int[] toNumbers(String input) {
		
		int[] nums = new int[input.length()];
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				nums[i] = 0;
			}else {				
				int ascii = (int)input.charAt(i) - 96;
				nums[i] = ascii;
			}
		}
		return nums;
	}
	
	public static void toLetters(int[] ascii) {
		
		String ans = "";
		for(int i = 0; i < ascii.length; i++) {		
			if(ascii[i] == 0) {
				ans += " ";
			}else {
				ans += Character.toString(ascii[i] + 96);				
			}
		}
		System.out.println(ans);
	}
	
	public static int[] decode(int[] ascii) {
		
		int[] half = new int[ascii.length];
		half[0] = ascii[0];
		
		for(int i = 1; i < ascii.length; i++) {
			while(ascii[i] < half[i - 1]) {
				ascii[i] += 27;
			}
			half[i] = ascii[i];
		}
		
		int[] ans = new int[half.length];
		ans[0] = half[0];
		
		for(int i = 1; i < half.length; i++) {
			ans[i] = half[i] - half[i - 1];
		}		
		return ans;
	}
	
	public static int[] encode(int[] ascii) {
		
		int[] half = new int[ascii.length];
		half[0] = ascii[0];
		
		for(int i = 1; i < ascii.length; i++) {
			half[i] = (half[i - 1] + ascii[i]);
		}
		
		int[] ans = new int[half.length];
		ans[0] = half[0];
		
		for(int i = 1; i < half.length; i++) {
			ans[i] = half[i] % 27;	
		}
		return ans;
	}
}