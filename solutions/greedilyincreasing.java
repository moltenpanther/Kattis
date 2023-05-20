import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        int j = 0;
        int[] ans = new int[num];

        int curr = 0;
        int count = 0;
        for(int i = 0; i < num; i++) {
        	int val = scan.nextInt();
        	if(val > curr) {
        		ans[j++] += val;
        		curr = val;
        		count++;
        	}
        }
                
        System.out.println(count);
        for(int i = 0; i < count; i++) {
        	System.out.print(ans[i] + " ");
        }
                        
        scan.close();
        
	}

}
