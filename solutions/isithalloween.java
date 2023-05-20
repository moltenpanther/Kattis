import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	String holimonth = scan.next();
    	int holiday = scan.nextInt();
    	
    	if(holimonth.contains("OCT") && holiday == 31) {
    		System.out.print("yup");
    	}else if(holimonth.contains("DEC") && holiday == 25) {
    		System.out.print("yup");
    	}else {
    		System.out.print("nope");
    	}

        scan.close();
    }
}