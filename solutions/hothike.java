import java.util.Scanner;

public class hothike {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		scan.nextLine();
		String[] temps = scan.nextLine().split(" ");
		
		int min = 41;
		int day = 0;
		for(int i = 1; i < num - 1; i++) {
			
			int temp1 = Integer.parseInt(temps[i - 1]);
			int temp2 = Integer.parseInt(temps[i + 1]);
			
			int tempMax = Math.max(temp1, temp2);
			if(tempMax < min) {
				min = tempMax;
				day = i;
			}	
		}
		
		System.out.println(day + " " + min);
		
		scan.close();
	}

}
