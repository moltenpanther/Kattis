import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Kattis {

    public static void main(String[] args) throws NumberFormatException, IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	
    	String[] disStr = br.readLine().split(" ");
    	int[] dis = new int[num];
    	HashSet<Integer> hash = new HashSet<Integer>();
    	
    	int count = 0;
    	int sum = 0;
    	for(int i = 0; i < num; i++) {
    		
    		int d = Integer.parseInt(disStr[i]);
    		sum += d;
    		
    		if(!hash.contains(d)) {
    			dis[count] = d;
    			hash.add(d);
    			count++;
    		}
    		
    	}
    	
    	Arrays.sort(dis);
    	
    	// Output
    	System.out.println(hash.size());
    	for(int i = num - 1; i >= num - count; i--) {    
    		int d = dis[i];
    		int sumTrue = sum - d;
    		System.out.print(sumTrue + " ");
    	}	
   		
        br.close();
    }

}
