import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int width = scan.nextInt();
        int num = scan.nextInt();
        int area = 0;
        
        for(int i = 0; i < num; i++) {
        	
        	int w = scan.nextInt();
        	int l = scan.nextInt();
        	
        	area += w * l;
        	
        }
        
        System.out.println(area / width);
        
        scan.close();
        
    }

}