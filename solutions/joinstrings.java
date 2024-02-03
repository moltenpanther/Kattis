import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class joinstrings {
        
    static String[] strings;
    static LinkedList<Integer>[] order;

    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        strings = new String[num];
            
        for(int i = 0; i < num; i++) {
            String word = br.readLine();
            strings[i] = word;
        }
        
        order = new LinkedList[num];
        
        int last = 0;
        for(int i = 0; i < num - 1; i++) {
            
            String[] line = br.readLine().split(" ");
            int from = Integer.parseInt(line[0]) - 1;
            int to = Integer.parseInt(line[1]) - 1;
            
            if(order[from] == null) {
                order[from] = new LinkedList<Integer>();
            }
            
            order[from].add(to);
            
            last = from;
        }
        
        list(last);
        
        
        // Output
        System.out.println(sb);

        br.close();
    }
    
    public static void list(int num) {
        
        sb.append(strings[num]);        
        if(order[num] != null) {
            for(int i = 0; i < order[num].size(); i++) {
                int next = order[num].get(i);
                list(next);
            }
        }
    }
}
