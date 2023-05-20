import java.util.Scanner;

public class maptiles2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String num = scan.next();
		
		int zoom = num.length();
		int size = (int) Math.pow(2, zoom);
		
		int mx = 0;
		int my = 0;
		
		int ax = 1;
		int zx = size;
		int ay = 1;
		int zy = size;
		
		for(int i = 0; i < num.length(); i++) {
			
			int dig = Integer.parseInt(String.valueOf(num.charAt(i)));
			mx = (ax + zx) / 2;
			my = (ay + zy) / 2;
			
			if(dig == 0 || dig == 2) {
				zx = mx;
			}else {
				ax = mx + 1;
				mx = ax;
			}
			
			if(dig == 0 || dig == 1) {
				zy = my;
			}else {
				ay = my + 1;
				my = ay;
			}
		}
		
		mx--;
		my--;
		
		System.out.println(zoom + " " + mx + " " + my);
		
		scan.close();
	}
	
}