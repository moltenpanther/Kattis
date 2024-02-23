import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class inversefactorial {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        HashMap<Integer, Integer> lenToNum = fillFactSizes();
        HashMap<Integer, Integer> smallFacts = getSmallFacts();
        
        String line = br.readLine();
        int len = line.length();
        if(len < 4) {
            int inpNum = Integer.parseInt(line);
            sb.append(smallFacts.get(inpNum));
        }else {
            int num = lenToNum.get(len);
            sb.append(num);
        }
        sb.append("\n");
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

    public static HashMap<Integer, Integer> getSmallFacts() {
        
        HashMap<Integer, Integer> smallFacts = new HashMap<Integer, Integer>();
        
        int fact = 1;
        for(int i = 2; i < 8; i++) {
            fact *= i;
            smallFacts.put(fact, i);
        }
        
        smallFacts.put(1, 1);
        
        return smallFacts;
    }

    public static HashMap<Integer, Integer> fillFactSizes() {
        
        int num = 1000000;
        HashMap<Integer, Integer> lenToNum = new HashMap<Integer, Integer>();
        
        double sum = 0;
        for(int i = 2; i <= num; i++) {
            double log = Math.log10(i);
            sum += log;
            
            int len = (int) Math.ceil(sum);
            lenToNum.put((int) len, i);
        }
        
        return lenToNum;
    }

}
