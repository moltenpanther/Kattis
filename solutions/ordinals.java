import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        
        String output = "{}";
        if(num == 1) {
        	output = "{" + output + "}";
        }else if(num > 1) {
        	output = "{{},{{}}}";
        }
        
        for(int i = 3; i <= num; i++) {
        		output = output.substring(0, output.length() - 1) + "," + output + "}";        	      	
        }
        
        
        System.out.println(output);
        
        scan.close();
    }

}
