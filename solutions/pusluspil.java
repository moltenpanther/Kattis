import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pusluspil {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int size = Integer.parseInt(line[1]);
        
        boolean[] pieces = new boolean[size];
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            for(int j = 1; j < line.length; j++) {
                int piece = Integer.parseInt(line[j]) - 1;
                if(!pieces[piece]) {
                    pieces[piece] = true;
                    size--;
                }
            }
        }
        
        // Output
        if(size == 0) {
            System.out.println("Jebb");
        }else {
            System.out.println("Neibb");
        }
        
        br.close();
    }

}
