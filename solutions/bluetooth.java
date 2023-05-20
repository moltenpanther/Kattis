import java.util.Scanner;

public class bluetooth {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int UL = 8;
        int DL = 8;
        int UR = 8;
        int DR = 8;
        
        boolean chewL = true;
        boolean chewR = true;
        
        int num = scan.nextInt();
        scan.nextLine();
        
        for(int i = 0; i < num; i++) {
        	
        	String line = scan.nextLine();
        	
        	if(line.charAt(3) == 'm') {
        		if(line.charAt(0) == '-') {
        			DL--;
        		}else if(line.charAt(0) == '+') {
        			UL--;
        		}else if(line.charAt(1) == '-') {
        			DR--;
        		}else if(line.charAt(1) == '+') {
        			UR--;
        		}
        	}else {
        		if(line.charAt(0) == '-' || line.charAt(0) == '+') {
        			chewL = false;
        		}else {
        			chewR = false;
        		}
        	}	
        	
        	if(UL * DL == 0) {
        		chewL = false;
        	}
        	if(UR * DR == 0) {
        		chewR = false;
        	}
        	
        }
        
        int ans = -1;
                
        if(chewL) {
        	ans = 0;
        }else if(chewR) {
        	ans = 1;
        }else {
        	ans = 2;
        }
        
        System.out.println(ans);
        
        scan.close();
    }
    
}
