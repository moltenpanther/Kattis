import java.util.ArrayList;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		int booked = scan.nextInt();
		
		if(total == booked) {
			System.out.println("too late");
		}else {
			ArrayList<Integer> rooms = new ArrayList<>();
			
			for(int i = 0; i < booked; i++) {
				rooms.add(scan.nextInt());
			}
			
			
			for(int i = 1; i < total + 1; i++) {
				if(!rooms.contains(i)) {
					System.out.println(i);
					i = total + 1;
				}
			}
		}
		
		scan.close();
	}	
}	