import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] grades = new int[5];
        for(int i = 0; i < 5; i++) {
        	grades[i] = scan.nextInt();
        }
        
        int score = scan.nextInt();
        
        if(score >= grades[0]) {
        	System.out.println("A");
        }else if(score >= grades[1]) {
        	System.out.println("B");
        }else if(score >= grades[2]) {
        	System.out.println("C");
        }else if(score >= grades[3]) {
        	System.out.println("D");
        }else if(score >= grades[4]) {
        	System.out.println("E");
        }else {
        	System.out.println("F");
        }
    }
}