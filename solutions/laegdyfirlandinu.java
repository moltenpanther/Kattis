import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class laegdyfirlandinu {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            
            line = br.readLine().split(" ");
            for(int j = 0; j < cols; j++) {
                int num = Integer.parseInt(line[j]);
                arr[i][j] = num;
            }
        }
        
        // Checking directions
        boolean match = false;
        for(int i = 1; i < rows - 1 && !match; i++) {
            
            for(int j = 1; j < cols - 1 && !match; j++) {
                int num = arr[i][j];
                if(arr[i - 1][j] > num && arr[i + 1][j] > num && arr[i][j - 1] > num && arr[i][j + 1] > num) {
                    match = true;
                }
            }
            
        }
        
        // Output
        if(match) {
            System.out.println("Jebb");
        }else {
            System.out.println("Neibb");
        }
        
        br.close();
    }

}
