import java.util.Scanner;

public class rationalsequence {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++) {
            
            scan.nextInt();
            String[] inp = scan.next().split("/");
            
            int p = Integer.parseInt(inp[0]);
            int q = Integer.parseInt(inp[1]);
            
            if(q > p) {
            	q -= p;
            	p += q;
            }else if(q == 1) {
            	q = ++p;
            	p = 1;
            }else {
            	
            	int countL = Math.floorDiv(p, q);
            	p = p % q;
            	q -= p;
            	p += q;
            	q += p * countL;       
            }
            
            System.out.println((i + 1) + " " + p + "/" + q);   
        }
        
        scan.close();
    }
    
}