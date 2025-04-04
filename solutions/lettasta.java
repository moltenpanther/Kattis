import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lettasta {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        int numProblems = Integer.parseInt(br.readLine());
        int numTeams = Integer.parseInt(br.readLine());

        String[] problems = br.readLine().split(" ");

        // Loop
        int indexProblems = 0;
        int max = -1;

        int[] scores = new int[numProblems];
        for(int i = 0; i < numTeams; i++) {
            
            String[] teamScore = br.readLine().split(" ");
            for(int j = 0; j < numProblems; j++) {
                int score = Integer.parseInt(teamScore[j]);
                scores[j] += score;
                if(scores[j] > max) {
                    max = scores[j];
                    indexProblems = j;
                }
            }
        }

        // Output
        System.out.println(problems[indexProblems]);

        br.close();
    }

}
