import java.util.Scanner;

public class Kattis{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        double area = Math.abs(x2 - x1) * Math.abs(y2 - y1);
      
        System.out.printf("%.3f", area);
        
        scan.close();
        
    }
}