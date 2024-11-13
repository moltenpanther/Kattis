import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class illuminatispotti {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.valueOf(br.readLine());
        int[][] matrix = new int[num][num];        
        
        for(int i = 0; i < num; i++) {   
            
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < num; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        int[][] matrix2 = multiply(matrix, matrix);
        int[][] matrix3 = multiply(matrix, matrix2);
        
        int sum = 0;
        for(int i = 0; i < num; i++) {
            sum+= matrix3[i][i];
        }
        
        sum /= 6;
        
        System.out.println(sum);
      
        br.close();
    }
    
    public static int[][] multiply(int[][] mat1, int[][] mat2){
        
        int num = mat1.length;
        int[][] ans = new int[num][num];
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                for(int k = 0; k < num; k++) {
                    ans[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        
        return ans;
    }
    
    public static int[][] multiply2nd(int[][] mat1, int[][] mat2){
        
        int num = mat1.length;
        int[][] ans = new int[num][num];
        for(int i = 0; i < num; i++) {
            for(int k = 0; k < num; k++) {
                ans[i][i] += mat1[i][k] * mat2[k][i];
            }   
        }
        
        return ans;
    }
        
}
