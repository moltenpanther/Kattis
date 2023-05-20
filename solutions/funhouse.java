import java.util.Scanner;

public class funhouse {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int cols = scan.nextInt();
        int rows = scan.nextInt();
        
        int count = 0;
        boolean makingMazes = true;
        while(makingMazes) {
        	
	        int startR = 0;
	        int startC = 0; 
	        char dir = 'U';
	        char[][] map = new char[rows][cols];
			for(int i = 0; i < rows; i++) {
				
				String line = scan.next();
				
				for(int j = 0; j < cols; j++) {
					char ch = line.charAt(j);
					map[i][j] = ch;
					
					if(ch == '*') {
						startR = i;
						startC = j;
						if(i == 0) {
							dir = 'D';
						}else if(j == 0) {
							dir = 'R';
						}else if(i == rows - 1) {
							dir = 'U';
						}else {
							dir = 'L';
						}
					}
				}
			}
			
			int i = startR;
			int j = startC;
			boolean end = false;
			while(!end) {
				
				if(dir == 'D') {
					i++;
				}else if(dir == 'R') {
					j++;
				}else if(dir == 'U') {
					i--;
				}else {
					j--;
				}
	
				char ch = map[i][j];
				
				if(ch == '/') {
					if(dir == 'D') {
						dir = 'L';
					}else if(dir == 'R') {
						dir = 'U';
					}else if(dir == 'U') {
						dir = 'R';
					}else {
						dir = 'D';
					}
				}else if(ch == '\\'){
					if(dir == 'D') {
						dir = 'R';
					}else if(dir == 'R') {
						dir = 'D';
					}else if(dir == 'U') {
						dir = 'L';
					}else {
						dir = 'U';
					}
				}else if(ch == 'x') {
					map[i][j] = '&';
					end = true;
				}
			}
			
			System.out.println("HOUSE " + ++count);
			for(i = 0; i < rows; i++) {
				for(j = 0; j < cols; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			
	        cols = scan.nextInt();
	        rows = scan.nextInt();
	        if(cols * rows == 0) {
	        	makingMazes = false;
	        }
	        
        }
        
        scan.close();
    }
    
}
