import java.util.HashMap;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	
		int num = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < num; i++) {
			String word = scan.nextLine().toLowerCase().replaceAll("-", " ");
			if(!map.containsKey(word)) {
				map.put(word, i);				
			}
		}
		
		System.out.println(map.size());
		
		scan.close();
	}
	
}
