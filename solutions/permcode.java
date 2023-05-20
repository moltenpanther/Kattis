import java.util.Scanner;

public class permcode {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		while(x != 0) {
					
			char[] str = scan.next().toCharArray();
			char[] perm = scan.next().toCharArray();
			char[] code = scan.next().toCharArray();
			int num = code.length;
			
			int d = (int)((Math.pow(num, 1.5) + x) % num);		
			char[] message = new char[code.length];					
						
			int pos = 0;
			for(int j = 0; j < str.length; j++) {
				if(code[d] == str[j]) {
					pos = j;
					j = str.length;
				}
			}
			
			message[d] = perm[pos];
			
			int i = d;
			for(int k = 0; k < code.length - 1; k++) {
				
				i--;
				if(i < 0) {
					i = code.length - 1;
				}
				
				int pos1 = 0;
				for(int j = 0; j < str.length; j++) {
					
					int n = i + 1;
					if(n >= code.length) {
						n = 0;
					}
					
					if(message[n] == str[j]) {
						pos1 = j;
						j = str.length;
					}
				}
				
				int pos2 = 0;
				for(int j = 0; j < str.length; j++) {
					if(code[i] == str[j]) {
						
						for(int m = 0; m < str.length; m++) {
							
							if((m ^ pos1) == j) {
								pos2 = m;
								j = str.length;
							}
							
						}
						
					}
				}
				
				message[i] = perm[pos2];
					
			}	
			
			System.out.println(message);
			
			x = scan.nextInt();
		}
		
		scan.close();		
	}
	
	public static String decode(int num, int d, char[] str, char[] perm, char[] code) {
		
		String message = "";
		for(int i = 0; i < num; i++) {
			int pos1 = 0;
			for(int j = 0; j < perm.length; j++) {
				if(code[i] == perm[j]) {
					pos1 = j;
					j = perm.length;
				}
			}

			if(i == d) {
				
				message += str[pos1];	
			}else {
				
				int pos2 = 0;
				for(int j = 0; j < str.length; j++) {
					if(code[(i + 1) % num] == str[j]) {
						pos2 = j;
						j = str.length;
					}
				}
				int pos = pos1 ^ pos2;
				message += str[pos];
				
			}
		}	
		
		return message;
		
	}	
}
