import java.util.ArrayList;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			String[] line = scan.nextLine().split(" ");
			ArrayList<String> names = new ArrayList<>();
			ArrayList<Double> beats = new ArrayList<>();
			
			for(int i = 0; i < line.length; i++) {
				if(hasNum(line, i)){
					beats.add(Double.parseDouble(line[i]));
				}else {
					names.add(line[i]);
				}
			}
			
			System.out.print(average(beats) + " ");
			for(int i = 0; i < names.size(); i++) {
				System.out.print(names.get(i) + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
	
	public static boolean hasNum(String[] line, int i) {
		
		char check = line[i].charAt(0);
		if(check > 64 && check < 91 || check > 96 && check < 123) {
			return false;			
		}
		return true;
	}

	public static double average(ArrayList<Double> beats) {
		
		double sum = 0;
		for(int i = 0; i < beats.size(); i++) {
			sum += beats.get(i);
		}
		
		return sum / beats.size();
	}
	
}	