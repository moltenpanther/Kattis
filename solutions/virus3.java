import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class virus3 {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String file = br.readLine();
        String virus = br.readLine();
        
        // Loop
        int virusIndex = 0;
        boolean isVirus = true;

        for(int i = 0; i < file.length(); i++) {
            
            char ch = file.charAt(i);
            boolean match = false;
            for(int j = virusIndex; j < virus.length(); j++) {
                if(ch == virus.charAt(j)) {
                    virusIndex = j + 1;
                    match = true;
                    break;
                }
            }

            if(!match) {
                isVirus = false;
            }

        }

        // Output
        if(isVirus) {
            sb.append("Ja");
        } else {
            sb.append("Nej");
        }
        System.out.println(sb);

        br.close();
    }

}
