import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

	static ArrayList<String> words = new ArrayList<String>();

	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	char[][] grid = new char[Integer.parseInt(scan.next())][Integer.parseInt(scan.next())];
    	
    	for(int i = 0; i < grid.length; i++) {
    		char[] row = scan.next().toCharArray();
    		for(int j = 0; j < grid[i].length; j++) {
    			grid[i][j] = row[j];
    		}
    	}

    	rowWord(grid, words);
    	colWord(grid, words);
   		find(words);
    	
    	scan.close();
    }
    
    public static ArrayList<String> rowWord(char[][] grid, ArrayList<String> words) {    	
    	
    	for(int i = 0; i < grid.length; i++) {
    		String row = "";
    		for(int j = 0; j < grid[i].length; j++) {
    			row += grid[i][j];
    		}
    		String[] wordsFound = row.split("#");
    		for(int j = 0; j < wordsFound.length; j++) {
    			if(wordsFound[j].length() > 1) {
    				words.add(wordsFound[j]);
    			}
    		}
    	}
    	return words;
    }
    
    public static ArrayList<String> colWord(char[][] grid, ArrayList<String> words) {    	
    	
    	for(int i = 0; i < grid[0].length; i++) {
    		String col = "";
    		for(int j = 0; j < grid.length; j++) {
    			col += grid[j][i];
    		}
    		String[] wordsFound = col.split("#");
    		for(int j = 0; j < wordsFound.length; j++) {
    			if(wordsFound[j].length() > 1) {
    				words.add(wordsFound[j]);
    			}
    		}
    	}	
    	return words;
    }
    
    public static void find(ArrayList<String> words) {
    	
    	String ans = "zzzzzzzzzzz";
    	for(int i = 0; i < words.size(); i++) {
    		if(words.get(i).compareTo(ans) < 0) {
    			ans = words.get(i);
    		}
    	}
    	System.out.println(ans);
    }
}