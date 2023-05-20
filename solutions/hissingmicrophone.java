import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        String sss = scanner.next();
        
        boolean mic = sss.contains("ss");

        	if (mic == true) {
        		System.out.println("hiss");
        	
        	}else {
        		System.out.print("no hiss");
        	}

        scanner.close();
    	
    }

}