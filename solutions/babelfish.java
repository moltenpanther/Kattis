import java.util.HashMap;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {
    	
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
    	
		String line = "";
		while((line = scan.nextLine()).contains(" ")) {
			String[] words = line.split(" ");
			map.put(words[1], words[0]);
		}
		
		while(scan.hasNext()) {
			String word = scan.nextLine();
			if(map.containsKey(word)) {
				System.out.println(map.get(word));
			}else {
				System.out.println("eh");
			}
		
		}
		
		scan.close();
	}
	
}