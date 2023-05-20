import java.util.ArrayList;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = Integer.valueOf(scan.nextLine());
		ArrayList<String> entry = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			String name = "";
			String notif = scan.nextLine();
			String anomaly = "";
			
			if(notif.contains("entry")) {
				name = notif.substring(6, notif.length());
				if(entryCheck(entry, name)) {
					anomaly = "(ANOMALY)";
				}else {
					entry.add(name);										
				}
				
				System.out.println(name + " entered " + anomaly);
				
			}else {
				name = notif.substring(5, notif.length());
				if(!entryCheck(entry, name)) {
					anomaly = "(ANOMALY)";
				}else {
					entry.remove(name);					
				}
				System.out.println(name + " exited " + anomaly);				
			}
		}	
		scan.close();
	}
	
	public static boolean entryCheck(ArrayList<String> entry, String name) {
		
		if(entry.contains(name)) {
			return true;
		}else {
			return false;			
		}
	}
	
}	