import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trollhunt {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int bridges = Integer.parseInt(line[0]);
        int knights = Integer.parseInt(line[1]);
        int groupSize = Integer.parseInt(line[2]);
        
        int groupNum = knights / groupSize;

        bridges--;
        int days = bridges / groupNum;
        if(bridges % groupNum != 0) {
            days++;
        }
        
        System.out.println(days);
        
        br.close();
    }

}
