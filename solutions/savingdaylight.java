import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()) {        	
	        String ans = "";
	        ans += scan.next() + " " + scan.next() + " " + scan.next() + " ";
	        
	        String[] time = scan.next().split(":");
	        int hourS = Integer.parseInt(time[0]);
	        int minS = Integer.parseInt(time[1]);
	        
	        time = scan.next().split(":");
	        int hourE = Integer.parseInt(time[0]);
	        int minE = Integer.parseInt(time[1]);
	        
	        int hour = hourE - hourS;
	        int min = minE - minS;
	        
	        if(min < 0) {
	        	min += 60;
	        	hour--;
	        }
	        
	        System.out.println(ans + hour + " hours " + min + " minutes");
        }
        
        scan.close();
    }
    
}
