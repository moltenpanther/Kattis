import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int per = scan.nextInt();
        int len = scan.nextInt();
        
        int[] times = new int[num + 2];
        times[0] = 0;
        for(int i = 1; i <= num; i++) {
        	times[i] = scan.nextInt();
        }
        times[num + 1] = len;
        
        float timeTot = 0;
        float time = 0;
        for(int i = 1; i < times.length; i++) {
        	time = times[i] - times[i - 1];
        	timeTot += time * (100 + (i - 1) * per) / 100;
        }
        
        System.out.println(timeTot);    
        
        scan.close();
    }    
    
}