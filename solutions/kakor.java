import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class kakor {

	public static void main(String... args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter w = new PrintWriter(new BufferedOutputStream(System.out));
	    
	    int num = Integer.parseInt(br.readLine());
	    String[] line = br.readLine().split(" ");
	    
	    int[] arr = new int[num];
	    
	    for (int i = 0; i < num; ++i) {
	      arr[i] = Integer.parseInt(line[i]);
	    }
	    
	    w.println(cookies(num, arr));
	    w.close();
	    
	}
	
	public static long cookies(int N, int[] A) {
		
		long sum = 0;
		for(int i = 0; i < N; i++) {
			long num = (long) A[i];
			sum += num;
		}
		
		return sum;
		
	}
}
