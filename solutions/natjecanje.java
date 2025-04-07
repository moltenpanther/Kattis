import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class natjecanje {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] line = br.readLine().split(" ");
        int numTeams = Integer.parseInt(line[0]);
        int numDamaged = Integer.parseInt(line[1]);
        int numReserve = Integer.parseInt(line[2]);

        String[] damagedTeamsStr = br.readLine().split(" ");
        int[] damagedTeams = new int[numDamaged];
        for (int i = 0; i < numDamaged; i++) {
            damagedTeams[i] = Integer.parseInt(damagedTeamsStr[i]);
        }

        String[] reserveTeamsStr = br.readLine().split(" ");
        int[] reserveTeams = new int[numReserve];
        for (int i = 0; i < numReserve; i++) {
            reserveTeams[i] = Integer.parseInt(reserveTeamsStr[i]);
        }

        Arrays.sort(damagedTeams);
        Arrays.sort(reserveTeams);

        boolean[] damaged = new boolean[numTeams + 2];
        for (int i = 0; i < numDamaged; i++) {
            damaged[damagedTeams[i]] = true;
        }

        boolean[] reserve = new boolean[numTeams + 2];
        for (int i = 0; i < numReserve; i++) {
            int team = reserveTeams[i];
            if (damaged[team]) {
                damaged[team] = false;
            } else {
                reserve[team] = true;
            }
        }

        // Loop
        for (int i = 1; i <= numTeams; i++) {
            if (damaged[i]) {
                if (reserve[i - 1]) {
                    reserve[i - 1] = false;
                    damaged[i] = false;
                } else if (reserve[i + 1]) {
                    reserve[i + 1] = false;
                    damaged[i] = false;
                }
            }
        }

        int total = 0;
        for (int i = 1; i <= numTeams; i++) {
            if (damaged[i]) {
                total++;
            }
        }

        // Output
        System.out.println(total);

        br.close();
    }

}
