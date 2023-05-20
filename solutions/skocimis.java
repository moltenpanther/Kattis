import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] num = new int[3];
        
        for(int i = 0; i < 3; i++) {
        	num[i] = scan.nextInt();
        }
        
        int dif1 = num[2] - num[1];
        int dif2 = num[1] - num[0];
        
        if(dif1 > dif2) {
        	System.out.println(dif1 - 1);
        }else {
        	System.out.println(dif2 - 1);
        }
        
        scan.close();
        
    }

}