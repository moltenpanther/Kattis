import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mancala {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 1; i <= num; i++) {
            
            String[] line = br.readLine().split(" ");
            int numBins = Integer.parseInt(line[1]);
            
            int[] bins = new int[numBins];
            
            int highest = -1;
            int count = 0;
            while(count < numBins) {
                
                // Filling the last empty
                int end = -1;
                for(int j = 1; j < numBins; j++) {
                    if(bins[j] == 0) {
                        count += j;
                        bins[j] += j;
                        end = j;
                        if(highest < j) {
                            highest = j;
                        }
                            
                        j = numBins;
                    }
                }
                
                // Removing from the ones before the last empty
                for(int j = 1; j < end; j++) {
                    bins[j]--;
                    count--;
                }

            }
            
            // Printing
            sb.append(i + " " + highest);
            sb.append("\n");
            
            count = 0;
            for(int j = 1; j <= highest; j++) {
                
                sb.append(bins[j] + " ");

                if(++count % 10 == 0) {
                    sb.append("\n");
                }
            }
            sb.append("\n");
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
