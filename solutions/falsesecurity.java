import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Key Arrays
		String[] abcs = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "_", ",", ".", "?"};
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "..--", ".-.-", "---.", "----"};
		
		//Calling Processes
		while(scan.hasNext()) {
			String input = scan.next();
			String[] ditda = toMorse(input, abcs, morse);
			int[] lengths = toRevNums(ditda);
			String ditdaRevNum = toRevMorse(ditda, lengths, abcs, morse);
			System.out.println(toABC(ditdaRevNum, abcs, morse));
		}
		scan.close();
	}
	
	//Turns Input into Morse
	public static String[] toMorse(String input, String[] abcs, String[] morse) {
		
		String[] ditda = new String[input.length()];
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < abcs.length; j++) {
				if(input.substring(i, i + 1).equals(abcs[j])) {
					ditda[i] = morse[j];
				}
			}
		}
		return ditda;
	}
	
	//Turning the Lengths into Numbers and Reversing Them
	public static int[] toRevNums(String[] ditda) {
		
		int[] lengths = new int[ditda.length];
		int j = 0;
		for(int i = ditda.length - 1; i >= 0; i--) {
			lengths[j] = ditda[i].length();
			j++;
		}
		return lengths;
	}
	
	//Splitting the Morse Code by the New Number Splits
	public static String toRevMorse(String[] ditda, int[] lengths, String[] abcs, String[] morse) {
		String noSpace = "";
		for(int i = 0; i < ditda.length; i++) {
			noSpace += ditda[i];
		}
	//	System.out.println("Morse: " + noSpace);
		
		String ditdaRevNum = "";
		int start = 0;
		int stop = 0;
		for(int i = 0; i < lengths.length; i++) {
			stop += lengths[i];
			ditdaRevNum += noSpace.substring(start, stop) + " ";
			start = stop;
		}		
	//	System.out.println("Split: " + ditdaRevNum);
		return ditdaRevNum;
	}
	
	//Converting back from Morse to ABC
	public static String toABC(String ditdaRevNum, String[] abcs, String[] morse) {
		String ans = "";
		String[] ansMorse = ditdaRevNum.split(" ");
		for(int i = 0; i < ansMorse.length; i++) {
			for(int j = 0; j < morse.length; j++) {
				if(ansMorse[i].equals(morse[j])) {
					ans += abcs[j];
				}
			}
		}
		return ans;
	}
	
}