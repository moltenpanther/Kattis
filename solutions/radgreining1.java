import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class radgreining1 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int length = Integer.parseInt(line[0]);
        int seqs = Integer.parseInt(line[1]);
        
        char[] dna = new char[length];
        for(int i = 0; i < length; i++) {
            dna[i] = '?';
        }
        
        boolean bad = false;
        for(int i = 0; i < seqs && !bad; i++) {
            
            line = br.readLine().split(" ");
            int pos = Integer.parseInt(line[0]) - 1;
            String seq = line[1];
            
            // Adding the sequence
            for(int j = 0; j < seq.length(); j++) {
                
                char posSeq = seq.charAt(j);
                char posDNA = dna[pos + j];
                
                if(posDNA == '?' || posDNA == posSeq) {
                    dna[pos + j] = posSeq;
                }else {
                    bad = true;
                }
            }
        }
        
        // Output
        if(bad) {
            sb.append("Villa");
        }else {
            for(int i = 0; i < length; i++) {
                sb.append(dna[i]);
            }
        }
        
        System.out.println(sb);
        
        br.close();
    }

}
