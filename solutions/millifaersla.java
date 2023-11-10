import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class millifaersla {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int monnei = Integer.parseInt(br.readLine());
        int fjee = Integer.parseInt(br.readLine());
        int dolla = Integer.parseInt(br.readLine());
        
        // Output
        if(monnei < fjee && monnei < dolla) {
            System.out.println("Monnei");           
        }else if(fjee < monnei && fjee < dolla) {
            System.out.println("Fjee");
        }else {
            System.out.println("Dolladollabilljoll");
        }
        
        br.close();
    }

}
