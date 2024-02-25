import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class orderedproblemset {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[] nums = new int[num];
        
        for(int i = 0; i < num; i++) {
            int dig = Integer.parseInt(br.readLine());
            nums[i] = dig;
        }
        
        // Looping
        LinkedList<Integer> list = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                
                int prevMax = -1;
                boolean good = true;
                for(int j = 0; j < num; j += i) {
                    
                    // Finding max of subset
                    int max = -1;
                    for(int k = j; k < j + i; k++) {
                        
                        if(nums[k] > max) {
                            max = nums[k];
                        }
                        
                        if(nums[k] < prevMax) {
                            good = false;
                            k = Integer.MAX_VALUE - 1;
                            j = num;
                        }
                        
                    }
                    
                    if(max > prevMax) {
                        prevMax = max;
                    }else {
                        good = false;
                        j = num;
                    }
                }
                
                if(good) {
                    list.add(num / i);
                }
            }
        }
        
        Collections.sort(list);
        
        // Output
        for(int div : list) {
            sb.append(div + "\n");
        }
        
        if(sb.toString().length() == 0) {
            sb.append(-1);
        }
        System.out.print(sb);
        
        br.close();
    }

}
