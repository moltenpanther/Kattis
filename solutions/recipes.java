import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			int ingredients = scan.nextInt();
			double portRec = scan.nextDouble();
			double portDes = scan.nextDouble();
			String[] items = new String[ingredients];
			double[] weight = new double[ingredients];
			double[] percent = new double[ingredients];
			
			int pos = 0;
			for(int j = 0; j < ingredients; j++) {
				
				items[j] = scan.next();
				weight[j] = scan.nextDouble();
				percent[j] = scan.nextDouble();
				if(percent[j] == 100.0) {
					pos = j;
				}						
			}
			
			double factor = portDes / portRec;
			double scaled = weight[pos] * factor;
			double[] scalWeight = findScaled(percent, scaled, pos);
			
			System.out.println("Recipe # " + (i + 1));
			for(int j = 0; j < ingredients; j++) {
				System.out.printf(items[j] + " %.1f\n", scalWeight[j]);
			}
			System.out.println("----------------------------------------");
		}	
		scan.close();
	}
	
	public static double[] findScaled(double[] perc, double scaled, int pos) {
		double[] scalWeight = new double[perc.length];
		for(int i = 0; i < perc.length; i++) {
			if(i != pos) {
				scalWeight[i] = perc[i] * scaled / 100; 
			}else {
				scalWeight[i] = scaled;
			}
		}
		return scalWeight;
	}
	
}	