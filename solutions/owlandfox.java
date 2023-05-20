import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int cases = scan.nextInt();
    	
    	for(int i = 0; i < cases; i++) {
    		
    		int num = scan.nextInt();
    		int sumNum = sum(num);
    		int ans = num - 1;
    		boolean check = false;
    		while(!check) {
    			if(sum(ans) + 1 == sumNum) {
    				check = true;
    			}else {
    				ans--;
    			}
    		}
    		System.out.println(ans);
    	}
    	
    	scan.close();
    }
    
    public static int sum(int num) {
    	if(num == 0) {
    		return 0;
    	}
    	return (num % 10) + sum(num / 10);
    }
                
}