import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
		int num = scan.nextInt();
		ArrayList<String> costumes = new ArrayList<>();
		int[] count = new int[num];
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			
			String response = scan.next();
			if(!costumes.contains(response)) {
				costumes.add(response);
			}			
			count[costumes.indexOf(response)]++;
		}
		
		int min = 1000;
		for(int i = 0; i < count.length; i++) {
			if(count[i] == 0) {
				i = count.length;
			}else if(count[i] < min) {
				min = count[i];
			}
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] == min) {
				ans.add(costumes.get(i));
			}
		}
		
		Collections.sort(ans);
		
		for(String i : ans) {
			System.out.println(i);
		}
		
		scan.close();
	}	
	
}	