import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;

public class alphabeticalaristocrats {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        LinkedList<Name> names = new LinkedList<>();
        for(int i = 0; i < num; i++) {
            
            String name = br.readLine();
            for(int j = 0; j < name.length(); j++) {
                
                if(name.charAt(j) >= 'A' && name.charAt(j) <= 'Z') {

                    String capitalized = name.substring(j);
                    String lowerCase = name.substring(0, j);
                    
                    names.add(new Name(capitalized, lowerCase));
                    
                    break;
                }
            }
        }

        names.sort(Comparator.comparing(a -> a.capitalized));

        // Output
        for(Name name : names) {
            sb.append(name).append("\n");
        }
        System.out.println(sb);

        br.close();
    }

}

class Name {

    String capitalized;
    String lowerCase;

    Name(String capitalized, String lowerCase) {
        this.capitalized = capitalized;
        this.lowerCase = lowerCase;
    }

    @Override
    public String toString() {

        if(lowerCase.length() > 0) {
            return lowerCase + capitalized;
        } else {
            return capitalized;
        }
    }
}
