import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class fourdierolls {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        String[] line = br.readLine().split(" ");
        HashSet<Integer> hash = new HashSet<Integer>();
        
        boolean aliceLost = false;
        int count = 0;
        for(int i = 0; i < num; i++) {
            int roll = Integer.parseInt(line[i]);
            if(!hash.contains(roll)) {
                hash.add(roll);
                count++;
            }else {
                aliceLost = true;
            }
        }
        
        int remVals = 6 - count;
        int remDice = 4 - num;
        
        if(!aliceLost) {
            
            int alice = 1;
            for(int i = 0; i < remDice; i++) {
                alice *= remVals--;
            }
            
            int total = (int)Math.pow(6, remDice);
            total -= alice;
            
            // Output
            System.out.println(alice + " " + total);
        
        }else {
            
            int alice = 0;
            int total = (int)Math.pow(6,  remDice);

            // Output
            System.out.println(alice + " " + total);
            
        }
        
        br.close();
    }

}
