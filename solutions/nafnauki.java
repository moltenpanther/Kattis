import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nafnauki {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split("\\.");
        String ext = line[line.length - 1];

        // Output
        System.out.println("." + ext);

        br.close();
    }

}
