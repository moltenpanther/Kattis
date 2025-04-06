import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class herbmixing {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int greens = Integer.parseInt(line[0]);
        int reds = Integer.parseInt(line[1]);
        
        // Loop
        int hp = 0;
        while(greens > 0 && reds > 0) {
            greens--;
            reds--;
            hp += 10;
        }

        while(greens - 3 >= 0) {
            greens -= 3;
            hp += 10;
        }

        while(greens - 2 >= 0) {
            greens -= 2;
            hp += 3;
        }

        while(greens - 1 >= 0) {
            greens -= 1;
            hp += 1;
        }

        // Output
        System.out.println(hp);

        br.close();
    }

}
