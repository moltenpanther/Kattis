import java.util.Scanner;

public class Kattis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int width = scan.nextInt();
		int piece = scan.nextInt();
		
		int[] cols = new int[width];
		for(int i = 0; i < width; i++) {
			cols[i] = scan.nextInt();
		}
		
		int count = 0;
		if(piece == 1) {
			count = checkPiece1(cols);
		}else if(piece == 2) {
			count = checkPiece2(cols);
		}else if(piece == 3) {
			count = checkPiece3(cols);
		}else if(piece == 4) {
			count = checkPiece4(cols);
		}else if(piece == 5) {
			count = checkPiece5(cols);
		}else if(piece == 6) {
			count = checkPiece6(cols);
		}else if(piece == 7) {
			count = checkPiece7(cols);
		}
		
		System.out.println(count);
		//5 6 0 0 0 0 0
		scan.close();
	}
	
	public static int checkPiece1(int[] arr) {
		
		int count = 0;	
		if(arr.length > 3) {
			for(int i = 0; i < arr.length - 3; i++) { 
				if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]  && arr[i] == arr[i + 3]) {
					count++;
				}
			}
		}
		
		return count + arr.length;
	}

	public static int checkPiece2(int[] arr) {
		
		int count = 0;
		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] == arr[i + 1]) {
					count++;
				}
			}
		}		
		
		return count;
	}
	
	public static int checkPiece3(int[] arr) {
		
		int count = 0;
		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2] - 1) {
					count++;
				}
			}
		}		
		
		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] == arr[i + 1] + 1) {
					count++;
				}
			}
		}	
		
		return count;
	}
	
	public static int checkPiece4(int[] arr) {
		
		int count = 0;
		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] - 1 == arr[i + 1] && arr[i] - 1 == arr[i + 2]) {
					count++;
				}
			}
		}	
		
		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] + 1 == arr[i + 1]) {
					count++;
				}
			}
		}			
		
		return count;
	}
	
	public static int checkPiece5(int[] arr) {
		
		int count = 0;	
		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
					count++;
				}
			}
		}	
		
		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] + 1 == arr[i + 1]) {
					count++;
				}
			}
		}		
		
		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] - 1 == arr[i + 1] && arr[i] == arr[i + 2]) {
					count++;
				}
			}
		}	
		
		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] - 1 == arr[i + 1]) {
					count++;
				}
			}
		}	
		return count;
	}
	
	public static int checkPiece6(int[] arr) {
		
		int count = 0;
		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
					count++;
				}
			}
		}	

		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] == arr[i + 1]) {
					count++;
				}
			}
		}		

		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 1) {
					count++;
				}
			}
		}	

		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] - 2 == arr[i + 1]) {
					count++;
				}
			}
		}	

		return count;
	}
	
	public static int checkPiece7(int[] arr) {
		
		int count = 0;
		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
					count++;
				}
			}
		}	
		
		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] + 2 == arr[i + 1]) {
					count++;
				}
			}
		}		
		
		if(arr.length > 2) {
			for(int i = 0; i < arr.length - 2; i++) { 
				if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2] + 1) {
					count++;
				}
			}
		}	
		
		if(arr.length > 1) {
			for(int i = 0; i < arr.length - 1; i++) { 
				if(arr[i] == arr[i + 1]) {
					count++;
				}
			}
		}			
		
		return count;
	}
}