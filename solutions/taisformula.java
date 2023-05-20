import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int[] time = new int[num];
        double[] glucose = new double[num];
        double trap = 0;
        
        for(int i = 0; i < num; i++) {
        	time[i] = scan.nextInt();
        	glucose[i] = scan.nextDouble();
        }
        
        for(int i = 1; i < num; i++) {
        	
        	trap += ((glucose[i] + glucose[i - 1]) / 2) * (time[i] - time[i - 1]);
        	
        }
            
        System.out.printf("%.6f", trap / 1000);
        scan.close();
        
    }

}