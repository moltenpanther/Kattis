import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        double width = scan.nextInt();
        double length = scan.nextInt();
        double hyp = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
        
        for(int i = 0; i < num; i++) {
        	
        	int match = scan.nextInt();
        	if(match <= hyp) {
        		System.out.println("DA");
        	}else {
        		System.out.println("NE");
        	}
        }
        
        scan.close();
        
    }

}