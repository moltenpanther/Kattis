import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class bestrelayteam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		ArrayList<Runner> first = new ArrayList<Runner>(num);
		ArrayList<Runner> other = new ArrayList<Runner>(num);

		for(int i = 0; i < num; i++) {
			
			String name = scan.next();
			double timeF = scan.nextDouble();
			double timeO = scan.nextDouble();
			
			Runner runner = new Runner(name, timeF, timeO);
			first.add(runner);
			other.add(runner);
		}
		
		first.sort(Comparator.comparing(Runner::getFirst));
		other.sort(Comparator.comparing(Runner::getOther));
		
		String names = "";
		double min = Integer.MAX_VALUE;

		for(int i = 0; i < 4; i++) {
			
			Runner runF = first.get(i);
			double legF = runF.first;
			double sum = legF;
			
			String tempNames = runF.name + "\n";
			
			int count = 0;
			for(int j = 0; j < 4; j++) {
				
				Runner runO = other.get(j);
				double legO = runO.other;
				if(!runF.equals(runO) && count < 3) {
					sum += legO;
					tempNames += runO.name + "\n";
					count++;
				}
			}
			
			if(sum < min) {
				min = sum;
				names = tempNames;
			}
			
		}
		
		
		System.out.printf("%.9f\n%s", min, names);
		
		
		scan.close();
	}
	
}

class Runner {
	
	String name = "";
	double first = 0.0;
	double other = 0.0;
	
	public Runner(String name, double first, double other) {
		this.name = name;
		this.first = first;
		this.other = other;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getFirst() {
		return first;
	}
	
	public void setFirst(double first) {
		this.first = first;
	}
	
	public double getOther() {
		return other;
	}
	
	public void setOther(double other) {
		this.other = other;
	}
	
}