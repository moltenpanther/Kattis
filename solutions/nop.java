import java.util.Scanner;

public class nop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String code = scan.next();
        
        int nops = 0;
        int count = 0;
        for(int i = 0; i < code.length(); i++) {
        	
        	char letter = code.charAt(i);
        	if(letter > 64 && letter < 91) {
        		
        		if(count % 4 == 0) {
        			count = 0;
        		}else {
        			int num = 4 - (count % 4);
        			nops += num;
        			count = 0;
        		}
        	}	
        	count++;
        	
        }
        
        System.out.println(nops);
        
        scan.close();
    }

}
