import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
        	
        	int pop1 = 1;
        	int pop2 = 1;
        	int ans = 0;
        	while(pop1 != 0) {
        		
        		pop2 = scan.nextInt();
                
                if(pop2 > (pop1 * 2)) {
                	ans += pop2 - (pop1 * 2);
                }
                pop1 = pop2;
        	}
        	System.out.println(ans);
        }
        scan.close();
    }

}