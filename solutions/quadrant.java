import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int x = scanner.nextInt();
    	int y = scanner.nextInt();
    	boolean xPos = x > 0;
    	boolean yPos = y > 0;
    	
    	if(xPos == true && yPos == true) {
    		System.out.println("1");
    	}else if(xPos == false && yPos == true) {
    		System.out.println("2");
    	}else if(xPos == false && yPos == false) {
    		System.out.println("3");
    	}else System.out.println("4");
    	
    	scanner.close();
    	
    }
    

}