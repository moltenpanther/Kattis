import java.util.HashMap;
import java.util.Scanner;

public class chopin {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, String> note = new HashMap<String, String>();
		
		note.put("A#", "Bb");
		note.put("C#", "Db");
		note.put("D#", "Eb");
		note.put("F#", "Gb");
		note.put("G#", "Ab");
		
		note.put("Bb", "A#");
		note.put("Db", "C#");
		note.put("Eb", "D#");
		note.put("Gb", "F#");
		note.put("Ab", "G#");
		
		int count = 1;
		while(scan.hasNext()) {
			
			String ans = "Case " + count + ": ";
			
			String key = scan.next();
			String tone = scan.next();
			
			if(note.containsKey(key)) {
				ans += note.get(key) + " " + tone;
			}else {
				ans += "UNIQUE";
			}
			
			System.out.println(ans);
			
			count++;
		}

		scan.close();
	}
	
}
