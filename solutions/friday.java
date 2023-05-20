import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			int daysYear = scan.nextInt();
			int[] month = new int[scan.nextInt()];
			
			//Making the calendar into a rectangle
			while(daysYear % 7 != 0) {
				daysYear++;
			}
			
			//Filling the calendar
			int[][] calendar = new int[daysYear / 7][7];
			int col = 0;
			int row = 0;
			for(int j = 0; j < month.length; j++) {
				
				int days = scan.nextInt();
				for(int k = 1; k <= days; k++) {
					if(col == 7) {
						col = 0;
						row++;
					}
					calendar[row][col] = k;
					col++;
				}
			}
			//Checking for Fri-the-13ths by counting Sun-the-1sts
			int ans = 0;
			for(int j = 0; j < calendar.length; j++) {
				if(calendar[j][5] == 13) {
					ans++;
				}	
			}
			System.out.println(ans);
		}
		scan.close();
	}
	
}	