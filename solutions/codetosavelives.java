import java.util.Scanner;

public class Kattis{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int loops = Integer.parseInt(scan.nextLine());
        
        for(int i = 0; i < loops; i++) {
        	
        	int num1 = Integer.parseInt(scan.nextLine().replaceAll(" ", ""));
        	int num2 = Integer.parseInt(scan.nextLine().replaceAll(" ", ""));
        	
        	String ans = String.valueOf(num1 + num2);
        	
        	for(int j = 0; j < ans.length(); j++) {
        		
        		System.out.print(ans.charAt(j));
        		
        		if(j != ans.length() - 1) {
        			System.out.print(" ");
        		}else {
        			System.out.println();
        		}        
        	}
        }
        
        scan.close();
    }  
}