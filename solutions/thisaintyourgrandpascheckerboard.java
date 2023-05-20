import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[][] row = new String[num][num];
		boolean error = false;
		
		for(int i = 0; i < num; i++) {
			
			String squares = scan.next();
			for(int j = 0; j < num; j++) {
				row[i][j] = String.valueOf(squares.charAt(j));
			}
		}
		//Row Check
		for(int i = 0; i < num; i++) {
			int rowW = 0;
			int rowB = 0;
			String cons = "";
			for(int j = 0; j < num; j++) {
				if(row[i][j].equals("W")) {
					rowW++;
				}else {
					rowB++;
				}
				cons += row[i][j];				
			}					
			if(rowW != rowB || cons.contains("WWW") || cons.contains("BBB")) {
				error = true;
			}
		}
		//Column Check
		if(!error) {
			for(int i = 0; i < num; i++) {
				int colW = 0;
				int colB = 0;
				String cons = "";
				for(int j = 0; j < num; j++) {
					if(row[j][i].equals("W")) {
						colW++;
					}else {
						colB++;
					}
					cons += row[j][i];				
				}		
				if(colW != colB || cons.contains("WWW") || cons.contains("BBB")) {
					error = true;
				}
			}
		}
		
		if(error) {
			System.out.println("0");
		}else {
			System.out.println("1");			
		}		
		scan.close();
	}
}