import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class generalizedfizzbuzz {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int numF = Integer.parseInt(line[1]);
        int numB = Integer.parseInt(line[2]);

        // Loop
        int fizz = 0;
        int buzz = 0;
        int fizzBuzz = 0;
        for(int i = 1; i <= num; i++) {
            if(i % numF == 0 && i % numB == 0) {
                fizzBuzz++;
            } else if(i % numF == 0) {
                fizz++;
            } else if(i % numB == 0) {
                buzz++;
            }
        }

        // Output
        System.out.println(fizz + " " + buzz + " " + fizzBuzz);

        br.close();
    }

}
