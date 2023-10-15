import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class variablearithmetic {
    
    static HashMap<String, Integer> map = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = "";
        while(!(line = br.readLine()).equals("0")) {
            
            if(line.contains("+")) {
                add(line);
            }else if(line.contains("=")) {
                equals(line);
            }else {
                if(map.containsKey(line)) {
                    System.out.println(map.get(line));                  
                }else {
                    System.out.println(line);
                }
            }
        }
        
        br.close();
    }
    
    public static void add(String line) {
        String[] split = line.split("[+]");
        ArrayList<String> adds = new ArrayList<String>();
        int sum = 0;
        
        for(int i = 0; i < split.length; i++) {
            String math = split[i].strip();
            if(Character.isDigit(math.charAt(0))) {
                sum += Integer.valueOf(math);
            }else {
                if(map.containsKey(math)) {
                    sum += map.get(math);
                }else {
                    adds.add(math);
                }
            }
        }
        
        if(adds.size() > 0 && sum != 0) {
            System.out.print(sum + " + ");          
        }else if(adds.size() == 0){
            System.out.print(sum + "\n");
        }else {
            
        }
        
        
        for(int i = 0; i < adds.size(); i++) {
            if(i == adds.size() - 1) {
                System.out.print(adds.get(i) + "\n");
            }else {             
                System.out.print(adds.get(i) + " + ");              
            }
        }
    }
    
    public static void equals(String line) {
        String[] split = line.split("=");
        map.put(split[0].strip(), Integer.parseInt(split[1].strip()));
    }
    
}
