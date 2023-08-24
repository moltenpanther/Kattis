import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class simplecronspec {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	HashSet<String> hash = new HashSet<String>();
    	
    	int[][][] clock = new int[24][60][60];
    	int unique = 0;
    	int total = 0;

    	int num = Integer.parseInt(scan.next());
    	for(int i = 0; i < num; i++) {
    		
    		String hours = scan.next();
    		String minutes = scan.next();
    		String seconds = scan.next();
    		
    		ArrayList<Integer> hArray = timeArray(hours, 24);
    		ArrayList<Integer> mArray = timeArray(minutes, 60);
    		ArrayList<Integer> sArray = timeArray(seconds, 60);
    		
    		
    		// Counting the clock
    		for(int h = 0; h < hArray.size(); h++) {
    			int hTime = hArray.get(h);
    			for(int m = 0; m < mArray.size(); m++) {
    				int mTime = mArray.get(m);
    				for(int s = 0; s < sArray.size(); s++) {
    					int sTime = sArray.get(s);
    					if(clock[hTime][mTime][sTime] == 0){
    						clock[hTime][mTime][sTime] = 1;
    						unique++;
    					}
    					total++;
    	    		}
        		}
    		}
    	}

    		
   		System.out.println(unique + " " + total);
    		
    	
    	scan.close();
    	
    }

    // Processing String to numbers
	private static ArrayList<Integer> timeArray(String time, int num) {
		
		ArrayList<Integer> timeArray = new ArrayList<Integer>();
		
		if(time.charAt(0) == '*') {	
			for(int i = 0; i < num; i++) {
				timeArray.add(i);
			}
		}else if(time.length() < 3) {
			timeArray.add(Integer.parseInt(time));
		}else {
			
			// Cases with multiple values
			String[] timeSplit = time.split(",");
			for(int i = 0; i < timeSplit.length; i++) {
				
				if(timeSplit[i].length() < 3) {
					timeArray.add(Integer.parseInt(timeSplit[i]));
				}else {
					
					String[] hyphen = timeSplit[i].split("-");
					int start = Integer.parseInt(hyphen[0]);
					int end = Integer.parseInt(hyphen[1]);
					
					for(int j = start; j <= end; j++) {
						timeArray.add(j);
					}	
				}	
			}			
		}
		
		return timeArray;
	}

	private static int[] fillTimeArray(int num) {
		
		int[] timeArray = new int[num];	
		for(int i = 0; i < num; i++) {
			timeArray[i] = i;
		}
		
		return timeArray;
	}

}
