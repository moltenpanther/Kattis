import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class perket {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());

        int[] adds = new int[num];
        int[] mults = new int[num];        
                
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            int mult = Integer.parseInt(line[0]);
            int add = Integer.parseInt(line[1]);
            
            adds[i] = add;
            mults[i] = mult;
        }
        
        // Calculating adds and mults
        LinkedList<Integer> prods = new LinkedList<Integer>();
        LinkedList<Integer> sums = new LinkedList<Integer>();
        
        prods.add(1);
        sums.add(0);
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < adds.length; i++) {
            
            int multIng = mults[i];
            int addIng = adds[i];
            
            int size = sums.size();
            for(int j = 0; j < size; j++) {
                
                int newProd = prods.get(j) * multIng;
                int newSum = sums.get(j) + addIng;
                
                prods.add(newProd);
                sums.add(newSum);               
                
                int dif = Math.abs(newSum - newProd);
                if(dif < min) {
                    min = dif;
                }
            }
        }
        
        // Output
        System.out.println(min);
        
        br.close();
    }
    
}
