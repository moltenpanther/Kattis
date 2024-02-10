import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class judging {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // [DOMjudge, Kattis]
        Hashtable<String, int[]> judge = new Hashtable<String, int[]>();
        
        int num = Integer.parseInt(br.readLine());
        
        // Input for DOMjudge
        for(int i = 0; i < num; i++) {
            
            String result = br.readLine();
            if(!judge.containsKey(result)) {
                judge.put(result, new int[2]);
            }
            judge.get(result)[0]++;
        }
        
        // Input for Kattis
        for(int i = 0; i < num; i++) {
            
            String result = br.readLine();
            if(!judge.containsKey(result)) {
                judge.put(result, new int[2]);
            }
            judge.get(result)[1]++;
        }
        
        // Checking counts
        int count = 0;
        for(String result : judge.keySet()) {
            
            int[] arr = judge.get(result);
            int dom = arr[0];
            int kat = arr[1];
            
            if(dom > 0 && kat > 0) {
                count += Math.min(dom, kat);
            }
        }
        
        // Output
        System.out.println(count);
        
        br.close();
    }

}
