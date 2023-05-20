import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	HashMap<String, String> signup = new HashMap<String, String>();
    	HashMap<String, Integer> count = new HashMap<String, Integer>();
    	ArrayList<String> courseList = new ArrayList<String>();
    	
    	int num = Integer.parseInt(scan.next());
    	for(int i = 0; i < num; i++) {
    		
    		String name = scan.next() + " " + scan.next();
    		String course = scan.next();
    		String both = name + " " + course;
    		
    		if(!signup.containsKey(both)) {
    			signup.put(both, "");
    			if(!count.containsKey(course)) {
    				courseList.add(course);
    				count.put(course, 1);
    			}else {
    				count.put(course, count.get(course) + 1);
    			}
    		}
    	}
    	
    	Collections.sort(courseList);
    	
    	for(int i = 0; i < courseList.size(); i++) {  		
    		String ans = courseList.get(i);
    		System.out.println(ans + " " + count.get(ans));
    	}
    	
    	scan.close();
	}
}