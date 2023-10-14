import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;

public class alphabetanimals {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine();
        char last = word.charAt(word.length() - 1);
        
        HashSet<Character> hash = new HashSet<Character>();
        LinkedList<String> list = new LinkedList<String>();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String animal = br.readLine();
            char start = animal.charAt(0);
            if(start == last) {
                list.add(animal);
            }
            
            hash.add(start);
        }
        
        String ans = "";
        if(list.size() > 0) {
            
            for(int i = 0; i < list.size(); i++) {
                
                String animal = list.get(i);
                char lastNow = animal.charAt(animal.length() - 1);
                
                if(!hash.contains(lastNow)) {                   
                    ans = animal + "!";
                    break;
                }else {
                    if(animal.charAt(0) == lastNow) {
                        if(list.size() == 1) {
                            ans = animal + "!";
                            break;      
                        }
                    }
                }
            }
            
            if(ans.length() < 1) {
                ans = list.get(0);
            }
        
        }else {
            ans = "?";
        }
        
        // Output
        System.out.println(ans);
        
        br.close();
    }

}

