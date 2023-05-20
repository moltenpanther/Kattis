import java.util.HashMap;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sets = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < sets; i++) {
			
			String[] nums = scan.nextLine().split(" ");			
			int num = Integer.parseInt(nums[1]);
			
			boolean prime = checkPrime(num);
			boolean happy = false;
			if(prime) {
				HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();			
				int check = isHappy(num, map);
				if(check == 1) {
					happy = true;
				}
				
			}
			
			if(prime && happy) {
				System.out.println(nums[0] + " " + num + " YES");				
			}else {
				System.out.println(nums[0] + " " + num + " NO");
			}
			
		}
		
		scan.close();
	}
	
	public static boolean checkPrime(int num) {
		
		if(num < 2) {
			return false;
		}else {		
		    for (int i = 2; i <= num / 2; i++) {
		    	if (num % i == 0) {
		    		return false;
		    	}
		    }
		}
		
		return true;
	}
	
	public static int isHappy(int num, HashMap<Integer, Integer> map) {
		
		num = sumSquare(num);
		if(num == 1 || map.containsKey(num)) {
			return num;
		}
		map.put(num, 0);
		
		return isHappy(num, map);
		
	}
	
	public static int sumSquare(int num) {
		int sum = 0;
		while(num != 0) {
			sum += Math.pow(num % 10, 2);
			num /= 10;		
		}
		return sum;
	}

}
