import java.util.Scanner;

public class weakvertices {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while(num != -1) {
			
			int[][] matrix = new int[num][num];
			
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < num; j++) {
					int edge = scan.nextInt();
					matrix[i][j] = edge;
				}
			}
			
			for(int i = 0; i < num; i++) {
	
				boolean weak = true;
	
				for(int j = 0; j < num; j++) {
					
					// Edge points at m
					int edgeToM = matrix[i][j];
					if(edgeToM == 1 && j < num - 1) {
						//Check for row for another 1 pointing to n
						for(int k = j + 1; k < num; k++) {
							int edgeToN = matrix[i][k];
							if(edgeToN == 1) {
								// Check if m -> n 
								if(matrix[j][k] == 1) {
									weak = false;
									j = num;
									k = num;
								}
							}
						}
					}
				}
				if(weak) {
					System.out.print(i + " ");
				}
			}
			
			System.out.println();
			num = scan.nextInt();

		}
		scan.close();
	}
		
}