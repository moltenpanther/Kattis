import java.util.Scanner;

public class Test{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	int side = scanner.nextInt();
    	int horiz1 = scanner.nextInt();
    	int horiz2 = 0;
    	int horizBig = 0;
    	int vert1 = scanner.nextInt();
    	int vert2 = 0;
    	int vertBig = 0;
    	int volume = 0;
    	
    	horiz2 = side - horiz1;
    	vert2 = side - vert1;
    	
    	if(horiz2> horiz1) {
    		horizBig = horiz2;
    	}else {
    		horizBig = horiz1;
    	}
    	
    	if(vert2 > vert1) {
    		vertBig = vert2;
    	}else {
    		vertBig = vert1;
    	}
    	
    	volume = 4 * horizBig * vertBig;
    	
    	System.out.println(volume);

    	scanner.close();
    }

}