import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class skeytasaman {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String word1 = br.readLine();
        String word2 = br.readLine();

        // Output
        System.out.println(word1 + word2);

        br.close();
    }

}
