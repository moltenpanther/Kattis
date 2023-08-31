import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class stokigalistor {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] listStr = br.readLine().split(" ");
        
        int[] list = new int[num];
        int[] sorted = new int[num];
        
        for(int i = 0; i < num; i++) {
            list[i] = Integer.parseInt(listStr[i]);
            sorted[i] = list[i];
        }
        
        Arrays.sort(sorted);
        
        int count = 0;
        for(int i = 0; i < num; i++) {
            if(list[i] != sorted[i]) {
                count++;
            }
        }  
        
        // Output
        System.out.println(count);      
        
        br.close();
        
    }

}

