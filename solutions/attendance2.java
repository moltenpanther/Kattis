import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class attendance2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        LinkedList<String> list = new LinkedList<String>();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            String line = br.readLine();
            list.add(line);
        }
        
        list.add(" ");
        
        boolean absent = false;
        for(int i = 0; i < num; i++) {
            String line = list.get(i);
            String next = list.get(i + 1);
            if(next.charAt(next.length() - 1) != '!' && line.charAt(line.length() - 1) != '!') {
                System.out.println(line);
                absent = true;
            }
        }
        
        // Output
        if(!absent) {
            System.out.println("No Absences");          
        }
        
        
        br.close();
    }

}
