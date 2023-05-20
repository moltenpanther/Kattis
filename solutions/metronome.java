import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        float num = scan.nextInt();
        
        num /= 4;
        
        System.out.printf("%.2f", num);
        
        scan.close();
        
	}

}
