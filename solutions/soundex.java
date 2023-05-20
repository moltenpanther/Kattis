import java.util.HashMap;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		
		map = loadMap(map);
		while(scan.hasNext()) {
			
			String ans = "X";
			String word = scan.next();
			for(int i = 0; i < word.length(); i++) {
				
				String num = map.get(word.substring(i, i + 1));
				
				if(!ans.endsWith(num)){
					ans += num;
				}
			}
			System.out.println(ans.replaceAll("X", ""));
		}
		
		scan.close();
	}
	
	public static HashMap<String, String> loadMap(HashMap<String, String> map){
		
		map.put("A", "X");
		map.put("E", "X");
		map.put("I", "X");
		map.put("O", "X");
		map.put("U", "X");
		map.put("H", "X");
		map.put("W", "X");
		map.put("Y", "X");
		map.put("B", "1");
		map.put("F", "1");
		map.put("P", "1");
		map.put("V", "1");
		map.put("C", "2");
		map.put("G", "2");
		map.put("J", "2");
		map.put("K", "2");
		map.put("Q", "2");
		map.put("S", "2");
		map.put("X", "2");
		map.put("Z", "2");
		map.put("D", "3");
		map.put("T", "3");
		map.put("L", "4");
		map.put("M", "5");
		map.put("N", "5");
		map.put("R", "6");

		return map;
	}
	
}
