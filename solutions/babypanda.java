import java.util.Scanner;

public class babypanda {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        scan.nextLong();
        long slimes = scan.nextLong();
        
        int count = 0;
        while(slimes >= 1) {
            
            if(slimes % 2 == 0) {
                slimes /= 2;
            }else {
                slimes--;
                count++;
            }
            
        }
        
        System.out.println(count);
        
        scan.close();
        
    }

}
