import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bidendalausbid {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] fromStr = br.readLine().split(":");
        String[] toStr = br.readLine().split(":");

        int fromHour = Integer.parseInt(fromStr[0]);
        int fromMin = Integer.parseInt(fromStr[1]);
        
        int toHour = Integer.parseInt(toStr[0]);
        int toMin = Integer.parseInt(toStr[1]);
        
        // Converts to all minutes
        int fromMinutes = fromHour * 60 + fromMin;
        int toMinutes = toHour * 60 + toMin;

        int diff = toMinutes - fromMinutes;

        if (diff < 0) {
            diff += 24 * 60; 
        }

        // Output
        System.out.println(diff);

        br.close();
    }

}
