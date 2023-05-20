import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String[] unitsL = {"thou", "inch", "foot", "yard", "chain", "furlong", "mile", "league"};
    	String[] unitsS = {"th", "in", "ft", "yd", "ch", "fur", "mi", "lea"};
    	double[] meas = {1, 1000, 12, 3, 22, 10, 8, 3};
    	
    	double num = Integer.valueOf(scan.next());
    	String unitFrom = scan.next();
    	scan.next();
    	String unitTo = scan.next();
    	
    	//Finding the start and end
    	int posFrom = 0;
    	int posTo = 0;
    	for(int i = 0; i < unitsL.length; i++) {
    		
    		if(unitsL[i].equals(unitFrom) || unitsS[i].equals(unitFrom)) {
    			posFrom = i;
    		}
    		if(unitsL[i].equals(unitTo) || unitsS[i].equals(unitTo)) {
    			posTo = i;
    		}
    	}
    	
    	if(posFrom < posTo) {
    		for(int i = posFrom; i < posTo; i++) {
    			num /= meas[i + 1];
    		}
    	}else if(posFrom > posTo){
    		for(int i = posFrom; i > posTo; i--) {
    			num *= meas[i];
    		}
    	}else {
    		
    	}
    	
    	System.out.println(num);
    	
    	scan.close();
    }
}