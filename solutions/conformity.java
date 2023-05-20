import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class conformity {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		int[] courses = new int[500];
		
		int students = Integer.parseInt(scan.nextLine());
		String[] courseList = new String[students]; 
		
		int max = -1;
		
		for(int i = 0; i < students; i++) {
			
			String input = scan.nextLine();
			String[] stuList = input.split(" ");
			Arrays.sort(stuList);
			
			String sorted = "";
			for(int j = 0; j < 5; j++) {
				sorted += stuList[j];
			}
			courseList[i] = sorted;
						
			if(hash.containsKey(sorted)) {
				int num = hash.get(sorted) + 1;
				hash.remove(sorted);
				hash.put(sorted, num);
				if(num > max) {
					max = num;
				}
				
			}else {
				hash.put(sorted, 1);
			}
			
		}
		
		if(max < 0) {
			max = 1;
		}
		
		int count = 0;
		for(int i = 0; i < students; i++) {
			if(hash.get(courseList[i]) == max) {
				count++;
			}
		}
		
		System.out.println(count);
		
		scan.close();
	}
}