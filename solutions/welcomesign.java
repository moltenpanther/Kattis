import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class welcomesign {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        // Loop
        int odd = 0;
        for(int i = 0; i < rows; i++) {
            
            String word = br.readLine();
            int len = word.length();
            int diff = cols - len;

            // Perfect
            if(diff == 0) {
                sb.append(word);
            
            // Even dots
            } else if(diff % 2 == 0) {

                for(int j = 0; j < diff / 2; j++) {
                    sb.append(".");
                }
                sb.append(word);
                for(int j = 0; j < diff / 2; j++) {
                    sb.append(".");
                }
            
            // Odd dots
            } else {

                if(odd % 2 == 0) {
                    for(int j = 0; j < diff / 2; j++) {
                        sb.append(".");
                    }
                    sb.append(word);
                    for(int j = 0; j < diff / 2 + 1; j++) {
                        sb.append(".");
                    }
                } else {
                    for(int j = 0; j < diff / 2 + 1; j++) {
                        sb.append(".");
                    }
                    sb.append(word);
                    for(int j = 0; j < diff / 2; j++) {
                        sb.append(".");
                    }
                }
                odd++;
            }
            sb.append("\n");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
