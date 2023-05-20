import java.util.Scanner;

public class Kattis {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] startStr = scan.next().split(":");
		String[] endStr = scan.next().split(":");
		
		int[] start = new int[3];
		int[] end = new int[3];
		
		for(int i = 0; i < 3; i++) {
			start[i] = Integer.parseInt(startStr[i]);
			end[i] = Integer.parseInt(endStr[i]);
		}
		
		int hour = end[0] - start[0];
		int min = end[1] - start[1];
		int sec = end[2] - start[2];
		
		if(sec < 0) {
			sec = 60 + sec;
			min--;
		}
		
		if(min < 0) {
			min = 60 + min;
			hour--;
		}
		
		if(hour < 0) {
			hour = 24 + hour;
		}
		
		if(hour == 0 && min == 0 && sec == 0) {
			hour = 24 + hour;
		}
		
		
		System.out.printf("%02d:%02d:%02d", hour, min, sec);
		
	}
	
}
