import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        
        double semi = (num1 + num2 + num3 + num4) / 2;
        
        double under = (semi - num1) * (semi - num2) * (semi - num3) * (semi - num4);
        
        double root = Math.sqrt(under);
        
        System.out.println(root);
        
        scan.close();
        
    }

}