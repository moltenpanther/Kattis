import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int h = scan.nextInt();
        int k = scan.nextInt();
        int v = scan.nextInt();
        int s = scan.nextInt();
        
        int sum = 0;
        
        while(h > 0) {
        	
        	v += s;
        	v -= Math.max(1, Math.floor(v / 10));
        	
        	if(v >= k) {
        		h++;
        	}else if(0 < v && v < k) {
        		
        		h--;
        		if(h == 0) {
        			v = 0;
        		}
        	}
        	
        	if(v <= 0) {
        		h = 0;
        		v = 0;
        	}
        	
        	if(s > 0) {
        		s--;
        	}
        	
        	sum += v;
        	
        }
        
        System.out.println(sum);
        
        scan.close();
    }    
    
}