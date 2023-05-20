import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        String[] split = input.split(" ");
        
        if(split[split.length - 1].equals("eh?")) {
        	System.out.println("Canadian!");
        }else {
        	System.out.println("Imposter!");
        }
        
        scan.close();
        
	}

}
