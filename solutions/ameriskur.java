import java.util.Scanner;

public class ameriskur {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        double ans = num * .09144;

        // Output
        System.out.println(ans);      
        
        scan.close();
    }

}
