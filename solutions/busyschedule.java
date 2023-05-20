import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Kattis extends KattisBST {

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int num = -1;
    	while((num = Integer.parseInt(scan.nextLine())) != 0){
    		for(int i = 0; i < num; i++) {
    			String time = scan.nextLine();
    			insert(time);
    		}
    		
    		walk();
    		root.setLeft(null);
    		root.setRight(null);
    		root = null;
    		System.out.println();
    	}

    	scan.close();
	}

}
class KattisBST {
	
	static Time root;
	static int size = 0;

	public static void insert(String time) {
			
			String[] info = time.split("[: ]");
					
			Time z = new Time(info[0], info[1], info[2]);		
			Time y = null;
			Time x = root;
			
			while(x != null) {
				y = x;
				if(z.getKey() < x.getKey()) {
					x = x.getLeft();
				}else {
					x = x.getRight();
				}
			}
			
			z.setParent(y);
			
			if(y == null) {
				root = z;
			}else if(z.getKey() < y.getKey()) {
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
	
	public static void recursiveWalk(Time x) {
		if(x != null) {
			recursiveWalk(x.getLeft());
			System.out.println(x);				
			recursiveWalk(x.getRight());
		}
	}

}

class Time{
	
	int key;
	String hour;
	String minute;
	String ampm;
	
	Time left;
	Time right;
	Time parent;
	
	public Time(String hour, String minute, String ampm) {
		this.hour = hour;
		this.minute = minute;
		this.ampm = ampm;

		int hr = Integer.parseInt(hour);
		int min = Integer.parseInt(minute);
		
		if(ampm.charAt(0) == 'a') {
			if(hr == 12) {
				hr = 0;
			}
			key = hr * 100 + min;
		}else {
			if(hr == 12) {
				key = hr * 100 + min;
			}else {
				key = (hr + 12) * 100 + min;
			}
		}
	}
	
	public String toString() {
		return hour + ":" + minute + " " + ampm;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public String getHour() {
		return this.hour;
	}

	public String getMinute() {
		return this.minute;
	}

	public String getAmPm() {
		return this.ampm;
	}

	public Time getLeft() {
		return this.left;
	}

	public Time getRight() {
		return this.right;
	}
	
	public Time getParent() {
		return this.parent;
	}
	
	public void setKey(Time x) {
		this.key = key;
	}
	
	public void setLeft(Time x) {
		this.left = x;
	}
	
	public void setRight(Time x) {
		this.right = x;
	}
	
	public void setParent(Time x) {
		this.parent = x;
	}
	
	public void setHour(String hour) {
		this.hour = hour;
	}

	public void setMinute(String minute) {
		this.minute = minute;		
	}
	
	public void setAmPm(String ampm) {
		this.ampm = ampm;
	}

}