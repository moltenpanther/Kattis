import java.util.Scanner;

public class mosquito {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			int mosq = scan.nextInt();
			int pupa = scan.nextInt();
			int larv = scan.nextInt();
			int eggs = scan.nextInt();
			int rth = scan.nextInt();
			int sth = scan.nextInt();
			int num = scan.nextInt();
	
			int oldMosq = mosq;
			for(int i = 0; i < num; i++) {
			//	System.out.println(eggs + " " + mosq + " " + pupa + " " + larv);
				mosq = pupa / sth;
				pupa = larv / rth;
				larv = oldMosq * eggs;
				oldMosq = mosq;
			}
			
			System.out.println(mosq);
			
		}

		scan.close();
	}
	
}
