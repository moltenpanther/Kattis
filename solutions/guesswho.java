import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class guesswho {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int queries = Integer.parseInt(line[2]);
        
        // Filling the list
        LinkedList<String> list = new LinkedList<String>();
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        
        for(int i = 0; i < num; i++) {
            String inp = br.readLine();
            list.add(inp);
            hash.put(inp, (i + 1));
        }
        
        // Querying
        for(int i = 0; i < queries; i++) {
            
            LinkedList<String> newList = new LinkedList<String>();
            
            line = br.readLine().split(" ");
            int att = Integer.parseInt(line[0]) - 1;
            char res = line[1].charAt(0);
            
            for(String query : list) {
                if(query.charAt(att) == res) {
                    newList.add(query);
                }
            }
            
            list = newList;
        }
        
        // Output
        if(list.size() > 1) {
            System.out.println("ambiguous");
            System.out.println(list.size());
        }else {
            System.out.println("unique");
            System.out.println(hash.get(list.get(0)));
        }
        
        br.close();
    }

}
