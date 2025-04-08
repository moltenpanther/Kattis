import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;

public class heimilisverk {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        HashSet<String> chores = new HashSet<>();
        LinkedList<String> choresList = new LinkedList<>();
        for(int i = 0; i < num; i++) {
            
            String chore = br.readLine();
            if(!chores.contains(chore)) {
                chores.add(chore);
                choresList.add(chore);
            }
        }

        // Output
        for(String chore : choresList) {
            sb.append(chore).append("\n");
        }
        System.out.println(sb);

        br.close();
    }

}
