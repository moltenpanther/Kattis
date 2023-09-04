import java.util.Scanner;

public class exactlyelectrical {
	
    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);

		int startX = scan.nextInt();
		int startY = scan.nextInt();
		
		int endX = scan.nextInt();
		int endY = scan.nextInt();
		
		int battery = scan.nextInt();
		
		int disX = Math.abs(startX - endX);
		int disY = Math.abs(startY - endY);
		
		int disTot = disX + disY;
		
		if(disTot <= battery) {
			
			boolean disEven = disTot % 2 == 0;
			boolean batEven = battery % 2 == 0;    			
			
			if(disEven && batEven) {
				System.out.println("Y");
			}else if(!disEven && !batEven) {
				System.out.println("Y");
			}else {
				System.out.println("N");
			}
			
		}else {
			System.out.println("N");
		}

   		
    	scan.close();
    }

}
