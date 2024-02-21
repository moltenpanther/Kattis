import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabet {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        int num = line.length();
        
        // Saving the alphabet as chars
        int[] abcs = new int[num];
        for(int i = 0; i < num; i++) {
            abcs[i] = line.charAt(i);
        }
        
        // Implementing the algorithm (from wikipedia, still learning it)
        int[] prevIndex = new int[num];
        int[] minVal = new int[num + 1];
        minVal[0] = -1;
        
        int len = 0;
        for(int i = 0; i < num; i++) {
            
            int low = 1;
            int high = len + 1;
            while(low < high) {
                int mid = low + (high - low) / 2;
                if(abcs[minVal[mid]] >= abcs[i]) {
                    high = mid;
                }else {
                    low = mid + 1;
                }
            }
            
            int newLen = low;
            prevIndex[i] = minVal[newLen - 1];
            minVal[newLen] = i;
            
            if(newLen > len) {
                len = newLen;
            }
            
        }

        // Output
        System.out.println(26 - len);
        
        br.close();
    }

}
