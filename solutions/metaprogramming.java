import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {
	
	static ArrayList<String> words = new ArrayList<>();
	static ArrayList<Integer> nums = new ArrayList<>();
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			String[] line = scan.nextLine().split(" ");
			
			if(line[0].equals("define")) {
				define(line);
			}else {
				if(words.contains(line[1]) && words.contains(line[3])) {
					System.out.println(eval(line));					
				}else {
					System.out.println("undefined");
				}
				
			}
			
		}
		
	}
	
	public static void define(String[] line) {
		
		if(!words.contains(line[2])) {
			nums.add(Integer.valueOf(line[1]));			
			words.add(line[2]);
		}else {
			int index = words.indexOf(line[2]);
			nums.remove(index);
			nums.add(index, Integer.valueOf(line[1]));
		}
	}
	
	public static boolean eval(String[] line) {
		
		int x = nums.get(words.indexOf(line[1]));
		int y = nums.get(words.indexOf(line[3]));
		
		if(line[2].equals("<")) {
			return x < y;
		}else if(line[2].equals(">")) {
			return x > y;
		}else {
			return x == y;
		}		
	}
	
}
