import java.util.Scanner;

public class countingclauses {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        if(num < 8){
            System.out.println("unsatisfactory");
        }else{
            System.out.println("satisfactory");
        }
        
        
        scan.close();
    }

}