import java.util.Scanner;

public class Kattis {
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		Stop route = new Stop();
		int[] stops = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			Stop x = new Stop(scan.nextInt());
			route.insert(x);
		}
		
		stops = route.walk(route.root, stops);
		stops[stops.length - 1] = 9999;
		
		int start = 0;
		int end = 0;
		boolean first = true;
		for(int i = 0; i < num; i++) {
			while(stops[i] == stops[i + 1] - 1) {
				if(first) {
					start = stops[i];
					first = false;
				}
				i++;
				end = stops[i];
			}
			
			if(end - start == 1) {
				System.out.print(start + " " + end + " ");
			}else if(start != 0) {
				System.out.print(start + "-" + end + " ");
			}else {
				System.out.print(stops[i] + " ");
			}
			start = 0;
			end = 0;
			first = true;
			
		}
		
		
		
		scan.close();
	}
	
}

class Stop {
	
	Stop root;
	Stop parent;
	Stop left;
	Stop right;
	int num;
	
	public Stop() {
		
	}
	
	public Stop(int num) {
		this.num = num;
	}
	
	public void insert(Stop z) {
		
		Stop y = root;
		Stop x = root;
		
		while(x != null) {
			
			y = x;
			if(z.num < x.num) {
				x = x.left;
			}else {
				x = x.right;
			}
		}
		
		z.parent = y;
		
		if(y == null) {
			root = z;
		}else if(z.num < y.num) {
			y.left = z;
		}else {
			y.right = z;
		}
	}

	int i = 0;
	public int[] walk(Stop x, int[] stops) {
		
		if(x != null) {			
			walk(x.left, stops);
			stops[i++] = x.num;
			walk(x.right, stops);
		}
		
		return stops;
	}
}