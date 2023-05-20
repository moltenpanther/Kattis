import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        HashMap<Character, String> hash = new HashMap<Character, String>();
        
        hash.put('A', "00");
        hash.put('B', "01");
        hash.put('C', "02");
        hash.put('D', "03");
        hash.put('E', "10");
        hash.put('F', "11");
        hash.put('G', "12");
        hash.put('H', "13");
        hash.put('I', "20");
        hash.put('J', "21");
        hash.put('K', "22");
        hash.put('L', "23");
        hash.put('M', "30");
        hash.put('N', "31");
        hash.put('O', "32");
        
        char[][] correct = {{'A', 'B', 'C', 'D'},
        					{'E', 'F', 'G', 'H'},
        					{'I', 'J', 'K', 'L'},
        					{'M', 'N', 'O', '.'}};
        
        char[][] puzzle = new char[4][4];
        
        for(int i = 0; i < 4; i++) {
        	String line = scan.next();
        	for(int j = 0; j < 4; j++) {
        		puzzle[i][j] = line.charAt(j);
        	}
        }
        
        int scatter = 0;
        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 4; j++) {
        		
        		if(puzzle[i][j] != correct[i][j] && puzzle[i][j] != '.') {
        			
        			String coord = hash.get(puzzle[i][j]); 
        			
        			int row = Math.abs(Integer.parseInt(coord.charAt(0) + "") - i);
        			int col = Math.abs(Integer.parseInt(coord.charAt(1) + "") - j);
        			
        			scatter += row + col;
        		}
        	}
        }
        
        System.out.println(scatter);
        
        scan.close();
    }    
	
}
