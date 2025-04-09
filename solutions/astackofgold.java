import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class astackofgold {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        long weight = Integer.parseInt(line[0]);
        int stacks = Integer.parseInt(line[1]);

        int coins = (stacks * (stacks + 1)) / 2;
        long normalWeight = coins * 29260;

        long stack = (weight - normalWeight) / 110;

        // Output
        System.out.println(stack);

        br.close();
    }

}
