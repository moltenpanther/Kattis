import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class fourthought {
 
    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        Hashtable<Integer, String> hash = getHash();
     
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
         
            int checkNum = Integer.parseInt(br.readLine());
            if(hash.containsKey(checkNum)) {
                System.out.println(hash.get(checkNum));
            }else {
                System.out.println("no solution");
            }
            
        }
     
         // Output
         System.out.println("");
         
     br.close();
    }
    
    public static Hashtable<Integer, String> getHash(){
     
        Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
     
        hash.put(-60, "4 - 4 * 4 * 4 = -60");
        hash.put(-16, "4 - 4 * 4 - 4 = -16");
        hash.put(-15, "4 / 4 - 4 * 4 = -15");
        hash.put(-8, "4 + 4 - 4 * 4 = -8");
        hash.put(-7, "4 / 4 - 4 - 4 = -7");
        hash.put(-4, "4 / 4 / 4 - 4 = -4");
        hash.put(-1, "4 - 4 - 4 / 4 = -1");
        hash.put(0, "4 + 4 - 4 - 4 = 0");
        hash.put(1, "4 + 4 / 4 - 4 = 1");
        hash.put(2, "4 / 4 + 4 / 4 = 2");
        hash.put(4, "4 + 4 / 4 / 4 = 4");
        hash.put(7, "4 + 4 - 4 / 4 = 7");
        hash.put(8, "4 + 4 + 4 - 4 = 8");
        hash.put(9, "4 + 4 + 4 / 4 = 9");
        hash.put(15, "4 * 4 - 4 / 4 = 15");
        hash.put(16, "4 + 4 + 4 + 4 = 16");
        hash.put(17, "4 * 4 + 4 / 4 = 17");
        hash.put(24, "4 + 4 + 4 * 4 = 24");
        hash.put(32, "4 * 4 + 4 * 4 = 32");
        hash.put(60, "4 * 4 * 4 - 4 = 60");
        hash.put(68, "4 + 4 * 4 * 4 = 68");
        hash.put(256, "4 * 4 * 4 * 4 = 256");
         
        return hash;
    }
    
}
