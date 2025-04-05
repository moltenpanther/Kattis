import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class intuitiveelements {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        for(int i = 0; i < num; i++) {
            String element = br.readLine();
            String abbr = br.readLine();

            boolean isAbbr = true;
            for(int j = 0; j < abbr.length(); j++) {
                char ch = abbr.charAt(j);
                if(!element.contains(ch + "")) {
                    isAbbr = false;
                    break;
                }
            }

            if(isAbbr) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
