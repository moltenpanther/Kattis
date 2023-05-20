import java.util.HashMap;
import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		boolean correct = true;
		
		int num = Integer.parseInt(scan.nextLine());
		for(int i = 0; i < num; i++) {
			
			boolean conclusion = false;
			String[] line = scan.nextLine().split(" ");
			
			for(int j = 0; j < line.length; j++) {
							
				if(line[j].equals("->")) {
					conclusion = true;
				}else if(conclusion) {
					map.put(line[j], j);
				}else {
					if(!map.containsKey(line[j])) {
						System.out.println(i + 1);
						correct = false;
						i = num;
						j = line.length;
					}
				}
			}		
		}

		if(correct) {
			System.out.println("correct");
		}
			
		scan.close();
	}
	
}
