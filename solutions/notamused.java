import java.util.HashMap;
import java.util.Scanner;

public class Kattis extends KattisBST{
	
	public static void main(String[] args) {
    	
		Scanner scan = new Scanner(System.in);
    	
		int day = 0;
		boolean open = false;
    	String line = "";
    	while(scan.hasNext()){		
    		
    		line = scan.nextLine();
    		
    		if(line.equals("OPEN")) {
    			open = true;
    		}else if(line.equals("CLOSE")) {
    			open = false;
    			day++;
    			System.out.println("Day " + day);
    			walk();
    			newBill();
    			System.out.println();
    		}else { 	
	    		insert(line);	
    		}
    		
    	}

    	scan.close();
	}

}
class KattisBST {
	
	static BillList root;
	static int size = 0;
	static HashMap<String, Integer> bill = new HashMap<String, Integer>();
	
	public static void insert(String line) {
		
		String[] nameSplit = line.split(" ");
		
		if(nameSplit[0].equals("ENTER")) {
			int timeIn = Integer.parseInt(nameSplit[2]) * -1;
			if(!bill.containsKey(nameSplit[1])) {
				bill.put(nameSplit[1], timeIn);
				
				BillList z = new BillList(nameSplit[1], Integer.parseInt(nameSplit[2]));		
				BillList y = null;
				BillList x = root;
					
				while(x != null) {
					y = x;
					if(z.getKey().compareTo(x.getKey()) < 0) {
						x = x.getLeft();
					}else {
						x = x.getRight();
					}
				}
					
				z.setParent(y);
					
				if(y == null) {
					root = z;
				}else if(z.getKey().compareTo(y.getKey()) < 0) {
					y.setLeft(z);
				}else {
					y.setRight(z);
				}
				size++;	

			}else {
				bill.put(nameSplit[1], bill.get(nameSplit[1]) + timeIn);
			}
		}else {
			int timeOut = Integer.parseInt(nameSplit[2]);
			bill.put(nameSplit[1], bill.get(nameSplit[1]) + timeOut);
		}
	}
	
	public static int size() {
		return size;
	}
	
	public static void walk() {
		recursiveWalk(root);
	}
	
	public static void delete(String k) {
		
		BillList y;
		BillList z = search(root, k);
			
		size--;
		if(z != null) {	
			if(z.getLeft() == null) {
				transplant(z, z.getRight());
			}else if(z.getRight() == null) {
				transplant(z, z.getLeft());
			}else {
				y = getMinimum(z.getRight());
				if(y.getParent() != z) {
					transplant(y, y.getRight());
					y.setRight(z.getRight());
					y.getRight().setParent(y);					
				}
				transplant(z, y);
				y.setLeft(z.getLeft());
				y.getLeft().setParent(y);
			}
		}
	}
	
	public static void transplant(BillList u, BillList v) {
		
		if(u.getParent() == null) {
			root = v;
		}else if(u == u.getParent().getLeft()) {
			u.getParent().setLeft(v);
		}else {
			u.getParent().setRight(v);
		}
		
		if(v != null) {
			v.setParent(u.getParent());
		}
	}
	
	public static BillList search(BillList x, String k) {
		
		if(x == null || k.equals(x.getKey())) {
			return x;
		}
		if(k.compareTo(x.getKey()) < 0) {
			return search(x.getLeft(), k);
		}else {
			return search(x.getRight(), k);
		}
		
	}
	
	public static BillList getMinimum(BillList x) {
		while(x.getLeft() != null) {
			x = x.getLeft();
		}
		return x;
	}
	
	public static void recursiveWalk(BillList x) {
		if(x != null) {
			recursiveWalk(x.getLeft());		
			
			double price = bill.get(x.getName()) * .1;
			System.out.printf(x.getName() + " $");
			System.out.printf("%.2f", price);
			System.out.println();
				
			recursiveWalk(x.getRight());
		}
	}
	
	public static void newBill() {
		bill = new HashMap<String, Integer>();	
		root.left = null;
		root.right = null;
		root = null;
	}

}

class BillList{
	
	String key;
	String name;
	int time;
	
	BillList left;
	BillList right;
	BillList parent;
	
	public BillList(String name, int time) {
		this.name = name;
		this.time = time;
		this.key = name;
	}
	
	public String toString() {
		return name + " $" + time;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTime() {
		return this.time;
	}

	public BillList getLeft() {
		return this.left;
	}

	public BillList getRight() {
		return this.right;
	}
	
	public BillList getParent() {
		return this.parent;
	}
	
	public void setKey(BillList x) {
		this.key = x.getName();
	}
	
	public void setLeft(BillList x) {
		this.left = x;
	}
	
	public void setRight(BillList x) {
		this.right = x;
	}
	
	public void setParent(BillList x) {
		this.parent = x;
	}
	
	public void setBillList(String name) {
		this.name = name;
	}

	public void setTime(int time) {
		this.time = time;		
	}

}