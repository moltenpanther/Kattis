import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class closingtheloop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int segs = scan.nextInt();
			
			ArrayList<Integer> blues = new ArrayList<Integer>();
			ArrayList<Integer> reds = new ArrayList<Integer>();
			
			for(int j = 0; j < segs; j++) {
				
				String rope = scan.next();
				int len = Integer.parseInt(rope.substring(0, rope.length() - 1));
				
				if(rope.charAt(rope.length() - 1) == 'R') {
					reds.add(len);
				}else {
					blues.add(len);
				}
			}
			
				
			Collections.sort(reds);
			Collections.sort(blues);
			
			Collections.reverse(reds);
			Collections.reverse(blues);
			
			
			// Red First
			boolean first = true;
			boolean redF = true;
			int max = 0;

			if(reds.size() == 0 || blues.size() == 0) {
					
			}else {
				
				for(int j = 0; j < segs; j++) {
					
					if(redF) {
						if(reds.size() > 0 && blues.size() > 0) {						
							int red = reds.remove(0);
							if(first) {
								max += red;
								first = false;
							}else {
								max += red - 1;
							}
							redF = false;
						}
					}else {
						if(blues.size() > 0) {						
							int blue = blues.remove(0);
							if(first) {
								max += blue;
								first = false;
							}else {
								max += blue - 1;
							}
							redF = true;
						}
					}
				}
				
				max--;
			
			}
			// Blue First
			
			
			
			
		//	System.out.printf("Case #%i: %i\n", i, max);
			System.out.println("Case #" + (i + 1) + ": " + max);
			
		}
		
		scan.close();
	}
	
}