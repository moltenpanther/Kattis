import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        if(y % 2 == 0){
            System.out.println("possible");
        }else{
            System.out.println("impossible");
        }
		
		scan.close();

	}

}