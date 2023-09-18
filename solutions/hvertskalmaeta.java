import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hvertskalmaeta {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String city = br.readLine();
        if(city.equals("Akureyri") || city.equals("Fjardabyggd") || city.equals("Mulathing")) {
            System.out.println("Akureyri");
        }else {
            System.out.println("Reykjavik");
        }

        br.close();
    }

}

