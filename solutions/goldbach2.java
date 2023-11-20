import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class goldbach2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            int even = Integer.parseInt(br.readLine());
            LinkedList<String> list = findSums(even);
            
            
            int count = list.size();
            sb.append(even + " has " + count + " representation(s)\n");
            for(String str : list) {
                sb.append(str + "\n");
            }
            sb.append("\n");
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

    private static LinkedList<String> findSums(int even) {
        
        LinkedList<String> list = new LinkedList<String>();
        
        int j = even - 3;
        for(int i = 3; i <= j; i += 2) {
                
            if(checkPrime(j)) {
                if(checkPrime(i)) {
                    list.add(i + "+" + j);                      
                }
            }
            j -= 2; 
        }
        
        if(even == 4) {
            list.add("2+2");
        }
        
        return list;
    }
    
    public static boolean checkPrime(int num) {
        
        double sqrt = Math.sqrt(num);
        for(int i = 2; i <= sqrt; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
