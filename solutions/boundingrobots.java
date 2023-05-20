import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int width = 1;
		int length = 1;
		int count = 0;
		
		while(width != -1 && length != -1) {
			
			width = scan.nextInt() - 1;
			length = scan.nextInt() - 1;
			
			if(width != -1 && length != -1) {
				
				int num = scan.nextInt();
				
				int posX = 0;
				int posY = 0;
				int posXR = 0;
				int posYR = 0;
				
				if(count != 0) {
					System.out.println();	
				}
				count++;
				
				for(int i = 0; i < num; i++) {
					
					String dir = scan.next();
					int steps = scan.nextInt();
					
					if(dir.equals("u")) {
						if(posY + steps <= length) {
							posY += steps;
							posYR += steps;
						}else if(posY + steps > length) {
							posY = length;
							posYR += steps;
						}
					}else if(dir.equals("d")) {
						if(posY - steps >= 0) {
							posY -= steps;
							posYR -= steps;
						}else if(posY - steps < 0) {
							posY = 0;
							posYR -= steps;
						}
					}else if(dir.equals("l")) {
						if(posX - steps >= 0) {
							posX -= steps;
							posXR -= steps;
						}else if(posX - steps < 0) {
							posX = 0;
							posXR -= steps;
						}
					}else if(dir.equals("r")) {
						if(posX + steps <= width) {
							posX += steps;
							posXR += steps;
						}else if(posX + steps > width) {
							posX = width;
							posXR += steps;
						}
					}
				}
				System.out.println("Robot thinks " + posXR + " " + posYR);			
				System.out.println("Actually at " + posX + " " + posY);
			}
		}
		scan.close();
	}
}