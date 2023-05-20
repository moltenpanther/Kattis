import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < num; i++) {
			
			String line = scan.nextLine();
			String[] soundArray = line.split(" ");
			ArrayList<String> sounds = new ArrayList<>();
			for(int j = 0; j < soundArray.length; j++) {
				sounds.add(soundArray[j]);
			}
			
			boolean fox = false;
			while(!fox) {
				
				String[] soundLine = scan.nextLine().split(" ");
				if(soundLine.length < 4) {
					while(sounds.contains(soundLine[2])) {
						sounds.remove(soundLine[2]);
					}
				}else {				
					for(int j = 0; j < sounds.size(); j++) {
						System.out.print(sounds.get(j) + " ");
						fox = true;
					}
				}
			}	
			
		}
		
	}
	
}

