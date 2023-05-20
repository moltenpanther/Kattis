import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class lessvsfewer {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> rules = new HashMap<String, String>();
		
		String[] nums = scan.nextLine().split(" ");
		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[1]);
		
		for(int i = 0; i < num1; i++) {
			String[] rule = scan.nextLine().split(" ");
			rules.put(rule[0], rule[1]);
		}
		
		ArrayList<String> count = new ArrayList<String>();
		count.add("number");
		count.add("most");
		count.add("fewest");
		count.add("more");
		count.add("fewer");
		count.add("many");
		count.add("few");
		
		ArrayList<String> mass = new ArrayList<String>();		
		mass.add("amount");
		mass.add("most");
		mass.add("least");
		mass.add("more");
		mass.add("less");
		mass.add("much");
		mass.add("little");
		
		for(int i = 0; i < num2; i++) {
			
			boolean okay = false;
			String[] test = scan.nextLine().split(" ");
			String nounType = rules.get(test[test.length - 1]);
			
			if(nounType.equals("c")) {
				if(count.contains(test[0])) {
					okay = true;
				}
			}else if(nounType.equals("m")) {
				if(mass.contains(test[0])) {
					okay = true;
				}
			}
			
			if(okay) {
				System.out.println("Correct!");
			}else {
				System.out.println("Not on my watch!");
			}
			
		}
		
		scan.close();
	}
}