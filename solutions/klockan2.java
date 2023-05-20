import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	HashMap<Integer, String> times = loadClock();
    	
        int num = scan.nextInt();
        
        System.out.println(times.get(num));
        
        scan.close();
    }
    
    public static HashMap<Integer, String> loadClock() {
    	
    	HashMap<Integer, String> times = new HashMap<Integer, String>();
    	
    	int minute = 0;
    	for(int i = 0; i < 720; i++) {
    		
    		int hour = i;
    		int dif = ((minute - hour) % 720);
    		if(dif < 0) {
    			dif += 720;
    		}
    		int degree = dif * 5;
    		
    		// Make Time String
    		String hourStr = "0";
    		if(i > 0) {
    			hourStr = (i / 60) + "";
    		}
    		if(hourStr.length() == 1) {
    			hourStr = "0" + hourStr;
    		}
    		
    		String minStr = (minute / 12)+ "";
    		if(minStr.length() == 1) {
    			minStr = "0" + minStr;
    		}
    		
    		String time = hourStr + ":" + minStr;   		
    		
    		times.put(degree, time);
    		
    		minute = (minute + 12) % 720;
    		
    	}
    	
    	return times;
    	
    }

}
