import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class musicyourway {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length; i++) {
            map.put(line[i], i);
        }
        
        int num = Integer.parseInt(br.readLine());
        List<String[]> songs = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            String[] song = br.readLine().split(" ");
            songs.add(song);
        }
        
        // Loop
        int numSorts = Integer.parseInt(br.readLine());
        for(int i = 0; i < numSorts; i++) {

            String sort = br.readLine();
            songs.sort(Comparator.comparing(attr -> attr[map.get(sort)]));
        
            for(int j = 0; j < line.length; j++) {
                sb.append(line[j]);
                if (j != line.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");

            // Output
            for(String[] song : songs) {

                for (int j = 0; j < song.length; j++) {
                    sb.append(song[j]);
                    if (j != song.length - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
            
        }
        sb.deleteCharAt(sb.length() - 1);
        
        // Outputtier Output
        System.out.println(sb);

        br.close();
    }

}
