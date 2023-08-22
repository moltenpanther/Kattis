import java.util.Scanner;

public class bossbattle {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	int num = scan.nextInt();
    	
    	if(num < 4) {
    		System.out.println(1);
    	}else {
    		System.out.println(num - 2);
    	}
    	
    	scan.close();
    	
    }

}
