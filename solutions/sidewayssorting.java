import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int row = scan.nextInt();
        int col = scan.nextInt();
        
        while(row + col != 0) {
        	        
	        char[][] chars = new char[row][col];
	        
	        for(int i = 0; i < row; i++) {
	        	String line = scan.next();
	        	for(int j = 0; j < col; j++) {
	        		chars[i][j] = line.charAt(j);
	        	}
	        }
	        
	        ArrayList<Word> words = new ArrayList<Word>();
	        for(int i = 0; i < col; i++) {
	        	String line = "";
	        	for(int j = 0; j < row; j++) {
	        		line += chars[j][i];
	        	}
	        	Word word = new Word(line);
	        	words.add(word);
	        }
	        
	        Collections.sort(words, Comparator.comparing(Word::getLow));
	        
	        for(int i = 0; i < row; i++) {
	        	for(int j = 0; j < col; j++) {
	        		System.out.print(words.get(j).reg.charAt(i));
	        	}
	        	System.out.println();
	        }
	        
	        System.out.println();
	        
	        row = scan.nextInt();
	        col = scan.nextInt();
	        
        }
        
        scan.close();
		
	}	

}

class Word {
	
	String reg;
	String low;
	
	public Word(String word) {
		reg = word;
		low = word.toLowerCase();
	}
	
	public String getReg() {
		return reg;
	}
	
	public void setReg(String reg) {
		this.reg = reg;
	}
	
	public String getLow() {
		return low;
	}
	
	public void setLow(String low) {
		this.low = low;
	}

}
