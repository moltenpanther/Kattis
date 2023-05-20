import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double cases = scan.nextDouble();
	
		for(double i = 0; i < cases; i++) {
			
			double godzilla = scan.nextDouble();
			double mechagod = scan.nextDouble();
			ArrayList<Double> armyG = new ArrayList<>(); 
			ArrayList<Double> armyM = new ArrayList<>(); 
			
			for(double j = 0; j < godzilla; j++) {
				armyG.add(scan.nextDouble());
			}
			for(double j = 0; j < mechagod; j++) {
				armyM.add(scan.nextDouble());
			}
			Collections.sort(armyG);
			Collections.sort(armyM);
			
			while(armyG.size() > 0 && armyM.size() > 0) {
				
				if(armyG.get(0) < armyM.get(0)) {
					armyG.remove(armyG.get(0));
				}else {
					armyM.remove(armyM.get(0));
				}
			}
			
			if(armyG.size() == 0) {
				System.out.println("MechaGodzilla");
			}else {
				System.out.println("Godzilla");
			}	
		}
		scan.close();
	}	
}	