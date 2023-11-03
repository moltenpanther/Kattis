import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class dyslectionary {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\molte\\eclipse-workspace\\Kattis\\bin\\input.txt"));
        
        int len = 0;
        String line = "";
        
        ArrayList<String> dict = new ArrayList<String>();
        while((line = br.readLine()) != null) {

            if(!line.equals("")) {
                
                if(line.length() > len) {
                    len = line.length();
                }
                
                StringBuilder sb = new StringBuilder();
                for(int i = line.length() - 1; i >= 0; i--) {
                    sb.append(line.charAt(i));
                }
                
                dict.add(sb.toString());
                
            }else {
                
                Collections.sort(dict);
                
                for(int i = 0; i < dict.size(); i++) {
                    
                    StringBuilder sb = new StringBuilder();
                    String word = dict.get(i);
                    
                    for(int j = 0; j < len - word.length(); j++) {
                        sb.append(" ");
                    }
                    
                    for(int j = word.length() - 1; j >= 0; j--) {
                        sb.append(word.charAt(j));
                    }
                    
                    System.out.println(sb); 
                }
                System.out.println();
                
                len = 0;
                dict = new ArrayList<String>();
            }
            
        }
        
        Collections.sort(dict);
        
        for(int i = 0; i < dict.size(); i++) {
            
            StringBuilder sb = new StringBuilder();
            String word = dict.get(i);
            
            for(int j = 0; j < len - word.length(); j++) {
                sb.append(" ");
            }
            
            for(int j = word.length() - 1; j >= 0; j--) {
                sb.append(word.charAt(j));
            }
            
            System.out.println(sb); 
        }
        
        br.close();
    }

}
