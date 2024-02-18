import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class howmanydigits {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] factSizes = fillFactSizes();
        
        String line = "";
        while((line = br.readLine()) != null) {
            
            int check = Integer.parseInt(line);
            sb.append(factSizes[check]);
            sb.append("\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

    public static int[] fillFactSizes() {
        
        int num = 1000000;
        int[] factSizes = new int[num + 1];
        
        double sum = 0;
        for(int i = 2; i <= num; i++) {
            double log = Math.log10(i);
            sum += log;
            factSizes[i] = (int) Math.ceil(sum);
        }
        
        factSizes[0] = 1;
        factSizes[1] = 1;
        
        return factSizes;
    }

}
