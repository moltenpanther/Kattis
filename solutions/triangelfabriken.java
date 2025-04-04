import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangelfabriken {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = Integer.parseInt(br.readLine());
        }
        
        // Loop
        boolean obtuse = false;
        boolean right = false;

        for(int i = 0; i < 3; i++) {
            if(sides[i] == 90) {
                right = true;
            } else if(sides[i] > 90) {
                obtuse = true;
            }
        }

        // Output
        if(obtuse) {
            sb.append("Trubbig");
        } else if(right) {
            sb.append("Ratvinklig");
        } else {
            sb.append("Spetsig");
        }
        sb.append(" Triangel");

        System.out.println(sb);

        br.close();
    }

}
