import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	String[] line1 = scan.nextLine().split("\\|");
    	String[] line2 = scan.nextLine().split("\\|");

        // Output
    	System.out.println(line1[0] + line2[0] + " " + line1[1] + line2[1]);
            
        scan.close();
    }

}
