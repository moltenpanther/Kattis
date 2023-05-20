import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	
    	int die1 = scan.nextInt();
    	int die2 = scan.nextInt();
    	int bigDie = 0;
    	int smallDie = 0;
    	
	    	if(die1 > die2) {
	    		bigDie = die1;
	    		smallDie = die2;
	    	}else {
	    		smallDie = die1;
	    		bigDie = die2;
	    	}
	    	
	    for(int i = smallDie; i <= bigDie; i++) {
	    	System.out.println(i + 1);
	    }	

        scan.close();
    }
}