import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class freeforminput {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String inp = "";
        while((inp = br.readLine()) != null) {

            String[] line = inp.split(",");

            double total = 0;
            for(int i = 0; i < line.length; i++) {

                // Loop (building nums)
                String numStr = "";
                for(int j = 0; j < line[i].length(); j++) {
                    char ch = line[i].charAt(j);
                    if(ch == '.' || ch == '-' || (ch >= '0' && ch <= '9')) {
                        numStr += ch;
                    }
                }

                total += Double.parseDouble(numStr);

            }

            sb.append(total + "\n");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
