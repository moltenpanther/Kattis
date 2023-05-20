import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] row = new String[5];
		
		for(int i = 0; i < 5; i++) {
			
			row[i] = scan.nextLine();
		}
		
		int[] num = new int [(row[0].length() + 1) / 4];
		int count = 0;
		boolean error = false;
		
		for(int i = 0; i < row[0].length(); i += 4) {
			String sub0 = row[0].substring(i, i + 3);
			String sub1 = row[1].substring(i, i + 3);
			String sub2 = row[2].substring(i, i + 3);
			String sub3 = row[3].substring(i, i + 3);
			String sub4 = row[4].substring(i, i + 3);
				
			if(sub0.equals("***") && sub1.equals("* *") && sub2.equals("* *") && sub3.equals("* *") && sub4.equals("***")) {
				num[count] = 0;
			}else if(sub0.equals("  *") && sub1.equals("  *") && sub2.equals("  *") && sub3.equals("  *") && sub4.equals("  *")) {
				num[count] = 1;
			}else if(sub0.equals("***") && sub1.equals("  *") && sub2.equals("***") && sub3.equals("*  ") && sub4.equals("***")) {
				num[count] = 2;
			}else if(sub0.equals("***") && sub1.equals("  *") && sub2.equals("***") && sub3.equals("  *") && sub4.equals("***")) {
				num[count] = 3;
			}else if(sub0.equals("* *") && sub1.equals("* *") && sub2.equals("***") && sub3.equals("  *") && sub4.equals("  *")) {
				num[count] = 4;
			}else if(sub0.equals("***") && sub1.equals("*  ") && sub2.equals("***") && sub3.equals("  *") && sub4.equals("***")) {
				num[count] = 5;
			}else if(sub0.equals("***") && sub1.equals("*  ") && sub2.equals("***") && sub3.equals("* *") && sub4.equals("***")) {
				num[count] = 6;
			}else if(sub0.equals("***") && sub1.equals("  *") && sub2.equals("  *") && sub3.equals("  *") && sub4.equals("  *")) {
				num[count] = 7;
			}else if(sub0.equals("***") && sub1.equals("* *") && sub2.equals("***") && sub3.equals("* *") && sub4.equals("***")) {
				num[count] = 8;
			}else if(sub0.equals("***") && sub1.equals("* *") && sub2.equals("***") && sub3.equals("  *") && sub4.equals("***")) {
				num[count] = 9;
			}else {
				error = true;
				i = row[0].length();
			}
			count++;
		}
		
		String ans = "";
		
		if(!error) {
			
			for(int i = 0; i < num.length; i++) {
				ans += String.valueOf(num[i]); 
			}
			if(Integer.valueOf(ans) % 6 == 0) {
				System.out.println("BEER!!");
			}else {
				error = true;
			}
		}
		
		if(error){
			System.out.println("BOOM!!");
		}
		
		scan.close();
	}
}