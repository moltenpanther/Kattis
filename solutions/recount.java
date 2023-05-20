import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	HashMap<String, Integer> voteMap = new HashMap<String, Integer>();
    	
    	String vote = "";
    	while(!(vote = scan.nextLine()).equals("***")){
    		
    		if(!voteMap.containsKey(vote)) {
    			voteMap.put(vote, 1);
    		}else {
    			int count = voteMap.get(vote) + 1;
    			voteMap.put(vote, count);
    		}
    	}

    	int max = -1;
    	String ans = "";
    	boolean check = false;
    	for(String voteCheck : voteMap.keySet()) {
    		if(voteMap.get(voteCheck) > max) {
    			max = voteMap.get(voteCheck);
    			ans = voteCheck;
    			check = false;
    		}else if(voteMap.get(voteCheck) == max) {
    			check = true;
    		}
    	}
    	
    	if(check) {
    		System.out.println("Runoff!");
    	}else {
    		System.out.println(ans);
    	}
    	scan.close();
    }
}