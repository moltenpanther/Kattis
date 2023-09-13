import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class battlesimulation {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hash = new HashSet<String>();
        
        hash.add("RBL");
        hash.add("RLB");
        hash.add("BLR");
        hash.add("BRL");
        hash.add("LBR");
        hash.add("LRB");
        
        String moves = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < moves.length(); i++) {
            
            boolean combo = false;
            if(i + 3 <= moves.length()) {
                String possible = moves.substring(i, i + 3);
                if(hash.contains(possible)) {
                    combo = true;
                    sb.append("C");
                    i += 2;
                }
            }
            
            if(!combo) {
                if(moves.charAt(i) == 'R') {
                    sb.append("S");
                }else if(moves.charAt(i) == 'B') {
                    sb.append("K");
                }else {
                    sb.append("H");
                }
            }
            
        }
        
        // Output
        System.out.println(sb.toString());
        
        br.close();
    }

}
