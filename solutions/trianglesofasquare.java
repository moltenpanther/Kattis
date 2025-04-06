import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class trianglesofasquare {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int coord1X = Integer.parseInt(line[0]);
        int coord1Y = Integer.parseInt(line[1]);
        int coord2X = Integer.parseInt(line[2]);
        int coord2Y = Integer.parseInt(line[3]);

        String coord1 = coord1X + " " + coord1Y;
        String coord2 = coord2X + " " + coord2Y;
        
        HashSet<String> coords = new HashSet<>();
        coords.add("0 0");
        coords.add("0 2024");
        coords.add("2024 0");
        coords.add("2024 2024");

        if(coords.contains(coord1) && coords.contains(coord2)) {
            sb.append("0");
        } else if(coords.contains(coord1) || coords.contains(coord2)) {
            sb.append("1");
        } else {
            sb.append("2");
        }

        // Output
        System.out.println(sb);

        br.close();
    }

}
