import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()) {
        	
		    String inp = scan.next();
		    String ans = "";
		    
		    int count = 1;
		    char prev = inp.charAt(0);
		    for(int i = 1; i < inp.length(); i++) {
		    	
		    	char ch = inp.charAt(i);
		    	
		    	if(ch == prev) {
		    		count++;
		    	}else {
		    		ans += count + "" + prev;
		    		count = 1;
		    	}
		    	
		    	prev = ch;
		    }
		    
		    ans += count + "" + prev;
		    
		    System.out.println(ans);
        }
        
        scan.close();
    }    
	
}
