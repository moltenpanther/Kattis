import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int cases = scan.nextInt();
        
        for(int i = 0; i < cases; i++) {
        	
        	int num = scan.nextInt();
        	HashMap<String, Integer> hash = new HashMap<String, Integer>();
        	ArrayList<String> toys = new ArrayList<String>();
        	ArrayList<Toy> list = new ArrayList<Toy>();
        	
        	for(int j = 0; j < num; j++) {
        		
        		String name = scan.next();
        		int amt = scan.nextInt();
        		
        		if(hash.containsKey(name)) {
        			hash.replace(name, hash.get(name), amt + hash.get(name));
        		}else {
        			hash.put(name, amt);
        			toys.add(name);
        		}
        	}
        	
        	System.out.println(toys.size());
        	for(int j = 0; j < toys.size(); j++) {
        		Toy toy = new Toy(toys.get(j), hash.get(toys.get(j)));
        		list.add(toy);
        	}
        	
        	Collections.sort(list, Comparator.comparing(Toy::getAmt).reversed().thenComparing(Toy::getName));
        	
        	for(Toy toy : list) {
        		System.out.println(toy);
        	}

        }
        
        
        scan.close();
    }    
	
}

class Toy {	

	String name;
	int amt;
	
	public Toy(String name, int amt) {
		this.name = name;
		this.amt = amt;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAmt() {
		return amt;
	}
	
	public void setAmt(int amt) {
		this.amt = amt;
	}
	
	public String toString() {
		
		return name + " " + amt;
	}
	
}