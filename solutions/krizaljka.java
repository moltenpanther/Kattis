import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Input
		String wordA = scan.next();
		String wordB = scan.next();
		
		//Finding the Matching Letter
		int pos1 = 30;
		int pos2 = 30;
		for(int i = 0; i < wordA.length(); i++) {
			for(int j = 0; j < wordB.length(); j++) {
				if(wordA.charAt(i) == wordB.charAt(j)) {
					pos1 = i;
					pos2 = j;
					i = wordA.length();
					j = wordB.length();
				}
			}
		}
		
		//Forming the 2D Array
		String[][] grid = new String[wordB.length()][wordA.length()];
		for(int i = 0; i < wordB.length(); i++) {
			for(int j = 0; j < wordA.length(); j++) {
				if(j == pos1) {
					grid[i][j] = String.valueOf(wordB.charAt(i));
				}else if(i == pos2) {
					grid[i][j] = String.valueOf(wordA.charAt(j));
				}else {
					grid[i][j] = ".";
				}
			}
		}
		
		//Printing it all
		for(int i = 0; i < wordB.length(); i++) {
			for(int j = 0; j < wordA.length(); j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}