import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int sunBefore = scan.nextInt() * -1;
        int sunNext = scan.nextInt();
        int moonBefore = scan.nextInt() * -1;
        int moonNext = scan.nextInt();
        
        int sun = sunBefore;
        int moon = moonBefore;
        
        
        while(sun != moon) {	
        	if(sun < moon) {
        		sun += sunNext;
        	}else if(moon < sun) {
        		moon += moonNext;
        	}
        }
        
        System.out.println(sun);
        
        scan.close();
    }    
    
}