import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class desiigner {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String line = br.readLine();

        HashSet<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("y");

        // Loop
        boolean rap = true;
        if(line.length() > 3 && line.charAt(0) == 'b' && vowels.contains(line.charAt(line.length() - 1) + "")) {

            for(int i = 1; i < line.length() - 1; i++) {
                if(line.charAt(i) != 'r') {
                    rap = false;
                    break;
                }
            }

        } else {
            rap = false;
        }

        // Output
        if(rap) {
            sb.append("Jebb");
        } else {
            sb.append("Neibb");
        }

        System.out.println(sb);

        br.close();
    }

}
