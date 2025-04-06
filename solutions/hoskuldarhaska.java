import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hoskuldarhaska {
    
    static List<List<String>> wordOptions = new ArrayList<>();
    static List<String> results = new ArrayList<>();
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        num = Integer.parseInt(reader.readLine());

        // Loop
        for (int i = 0; i < num; i++) {
            String[] parts = reader.readLine().split(" ");
            int k = Integer.parseInt(parts[0]);

            List<String> words = new ArrayList<>();
            for (int j = 1; j <= k; j++) {
                words.add(parts[j]);
            }

            Collections.sort(words);
            wordOptions.add(words);
        }

        generateSpoilers(0, sb);

        // Output
        for (String spoiler : results) {
            System.out.println(spoiler);
        }
    }

    private static void generateSpoilers(int depth, StringBuilder current) {

        if (depth == num) {
            results.add(current.toString());
            return;
        }

        for (String word : wordOptions.get(depth)) {

            int lenBefore = current.length();
            if (lenBefore > 0) {
                current.append(" ");
            }

            current.append(word);

            generateSpoilers(depth + 1, current);

            current.setLength(lenBefore);
        }
    }
}
