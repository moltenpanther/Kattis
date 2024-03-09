import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class patchwork {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        char[][] quilt = new char[rows][cols];
        
        int patches = Integer.parseInt(br.readLine());
        
        HashMap<Integer, char[][]> hash = new HashMap<Integer, char[][]>();
        int count = 0;
        
        // Reading in patches
        for(int h = 0; h < patches; h++) {
            
            line = br.readLine().split(" ");
            int patchRows = Integer.parseInt(line[0]);
            int patchCols = Integer.parseInt(line[1]);
            
            // Building Patch
            char[][] patch = new char[patchRows][patchCols];
            for(int i = 0; i < patchRows; i++) {
                String row = br.readLine();
                for(int j = 0; j < patchCols; j++) {
                    patch[i][j] = row.charAt(j);
                }
            }
            
            hash.put(++count, patch);
        }
        
        // Placing patches
        int num = Integer.parseInt(br.readLine());
        for(int h = 0; h < num; h++) {
            
            line = br.readLine().split(" ");
            int patchRow = Integer.parseInt(line[0]);
            int patchCol = Integer.parseInt(line[1]);
            int patchNum = Integer.parseInt(line[2]);
            
            char[][] patch = hash.get(patchNum);
            
            for(int i = 0; i < patch.length; i++) {
                for(int j = 0; j < patch[0].length; j++) {
                    if(patchRow + i < rows && patchCol + j < cols) {
                        quilt[patchRow + i][patchCol + j] = patch[i][j];
                    }
                }
            }
        }
        
        // Output
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(quilt[i][j] == 0) {
                    sb.append('.');
                }else {
                    sb.append(quilt[i][j]);
                }
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
        
        br.close();
    }

}
