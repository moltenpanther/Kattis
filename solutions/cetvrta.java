import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scan = new Scanner(System.in);
    	int ansX = 0;
    	int ansY = 0;
    	
    	int coord1X = scan.nextInt();
       	int coord1Y = scan.nextInt();
       	int coord2X = scan.nextInt();
       	int coord2Y = scan.nextInt();
   		int coord3X = scan.nextInt();
       	int coord3Y = scan.nextInt();
        //Finding X
        	if(coord1X != coord2X && coord1X != coord3X) {
        		ansX = coord1X;
        	}else if(coord1X != coord2X && coord1X == coord3X) {
        		ansX = coord2X;
        	}else {
        		ansX = coord3X;
        	}
        //Finding Y
        	if(coord1Y != coord2Y && coord1Y != coord3Y) {
        		ansY = coord1Y;
        	}else if(coord1Y != coord2Y && coord1Y == coord3Y) {
        		ansY = coord2Y;
        	}else {
        		ansY = coord3Y;
        	}
    	
        System.out.print(ansX + " " + ansY);
        	
        scan.close();
    }
}