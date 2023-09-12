import java.util.Scanner;

public class eveningout1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        long numA = scan.nextLong();
        long numB = scan.nextLong();
        
        long rem = numA % numB;
        long other = numB - rem;
        
        // Output
        System.out.println(Math.min(rem, other));
        
        scan.close();
    }

}

