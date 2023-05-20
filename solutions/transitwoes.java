import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int classTime = scan.nextInt();
		int num = scan.nextInt();
		
		int[] walkTime = new int[num + 1];
		int[] busTime = new int[num];
		int[] busInterval = new int[num];
		
		for(int i = 0; i < num + 1; i++) {
			walkTime[i] = scan.nextInt();
		}
				
		for(int i = 0; i < num; i++) {
			busTime[i] = scan.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			busInterval[i] = scan.nextInt();
		}
		
		int count = start;
		int walkCount = 0;
		int busCount = 0;
		
		count += walkTime[walkCount];
		walkCount++;
		
		while(busCount < num) {
					
			if(count % busInterval[busCount] == 0) {
				count += busTime[busCount];			
			}else {
				if(count < busInterval[busCount]) {
					count += (busInterval[busCount] - count) + busTime[busCount];
				}else {
					count += (count % busInterval[busCount] + busTime[busCount]);
				}
			}
			count += walkTime[walkCount];
			busCount++;
			walkCount++;
		}

		if(count <= classTime) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}	
		scan.close();
	}	
}	