import java.util.HashMap;
import java.util.Scanner;

public class Kattis extends KattisBST2{
	
	public static void main(String[] args) {
    	
		Scanner scan = new Scanner(System.in);
    	
    	String line = "";
    	while(scan.hasNext()){		
    		line = scan.nextLine();
    		insert(line);	
    		
    	}
    	walk();

    	scan.close();
	}

}
class KattisBST2 {
	
	static Name root;
	static int size = 0;
	static HashMap<String, String> check = new HashMap<String, String>();
	static HashMap<String, String> check2 = new HashMap<String, String>();
	
	public static void insert(String name) {
		
		String[] nameSplit = name.split(" ");

		if(!check.containsKey(nameSplit[0])) {
			check.put(nameSplit[0], "");
		}else {
			check2.put(nameSplit[0], nameSplit[1]);
		}
					
		Name z = new Name(nameSplit[0], nameSplit[1]);		
		Name y = null;
		Name x = root;
			
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
	}
	
	public static int size() {
		return size;
	}
	
	public static void walk() {
		recursiveWalk(root);
	}
	
	public static void delete(String k) {
		
		Name y;
		Name z = search(root, k);
			
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
	
	public static void transplant(Name u, Name v) {
		
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
	
	public static Name search(Name x, String k) {
		
		if(x == null || k.equals(x.getKey())) {
			return x;
		}
		if(k.compareTo(x.getKey()) < 0) {
			return search(x.getLeft(), k);
		}else {
			return search(x.getRight(), k);
		}
		
	}
	
	public static Name getMinimum(Name x) {
		while(x.getLeft() != null) {
			x = x.getLeft();
		}
		return x;
	}
	
	public static void recursiveWalk(Name x) {
		if(x != null) {
			recursiveWalk(x.getLeft());
			
			if(!check2.containsKey(x.getFName())) {
				System.out.println(x.getFName());
			}else {
				System.out.println(x.getFName() + " " + x.getLName());
			}
			
			recursiveWalk(x.getRight());
		}
	}

}

class Name{
	
	String key;
	String fName;
	String lName;
	
	Name left;
	Name right;
	Name parent;
	
	public Name(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
		String revName = lName + fName;
		this.key = revName;
	}
	
	public String toString() {
		return fName + " " + lName;
	}
	
	public String getKey() {
		return this.key;
	}
	
	public String getFName() {
		return this.fName;
	}

	public String getLName() {
		return this.lName;
	}

	public Name getLeft() {
		return this.left;
	}

	public Name getRight() {
		return this.right;
	}
	
	public Name getParent() {
		return this.parent;
	}
	
	public void setKey(Name x) {
		this.key = x.getLName() + x.getFName();
	}
	
	public void setLeft(Name x) {
		this.left = x;
	}
	
	public void setRight(Name x) {
		this.right = x;
	}
	
	public void setParent(Name x) {
		this.parent = x;
	}
	
	public void setFName(String fName) {
		this.fName = fName;
	}

	public void setLName(String lName) {
		this.lName = lName;		
	}

}