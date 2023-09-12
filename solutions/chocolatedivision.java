import java.util.Scanner;

public class chocolatedivision {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        
        // Output
        if((rows * cols) % 2 == 0) {
            System.out.println("Alf");
        }else {
            System.out.println("Beata");
        }
        
        scan.close();
    }

}

