import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int[] arrive = new int[3];
		int[] depart = new int[3];
		
		int min = 101;
		int max = 0;
		for(int i = 0; i < 3; i++) {
			arrive[i] = scan.nextInt();
			if(arrive[i] < min) {
				min = arrive[i];
			}
			depart[i] = scan.nextInt();
			if(depart[i] > max) {
				max = depart[i];
			}
		}
		
		int price = 0;
		for(int i = min; i <= max; i++) {

			if((parked(arrive[0], depart[0], i) && !parked(arrive[1], depart[1], i) && !parked(arrive[2], depart[2], i)) || (!parked(arrive[0], depart[0], i) && parked(arrive[1], depart[1], i) && !parked(arrive[2], depart[2], i)) || (!parked(arrive[0], depart[0], i) && !parked(arrive[1], depart[1], i) && parked(arrive[2], depart[2], i))) {
				price += a;
			}else if((parked(arrive[0], depart[0], i) && parked(arrive[1], depart[1], i) && !parked(arrive[2], depart[2], i)) || (parked(arrive[0], depart[0], i) && !parked(arrive[1], depart[1], i) && parked(arrive[2], depart[2], i)) || (!parked(arrive[0], depart[0], i) && parked(arrive[1], depart[1], i) && parked(arrive[2], depart[2], i))) {
				price += b * 2;
			}else if (parked(arrive[0], depart[0], i) && parked(arrive[1], depart[1], i) && parked(arrive[2], depart[2], i)) {
				price += c * 3;
			}
		}
		
		System.out.println(price);
		scan.close();
	}
	
	public static boolean parked(int arrive, int depart, int time) {
			
		if(time >= arrive && time < depart) {
			return true;			
		}else {
			return false;			
		}
	}	
	
}	