import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class calculatingdartscores {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Hashtable<Integer, String> hash = new Hashtable<Integer, String>();
        hash.put(0, "triple");
        hash.put(1, "double");
        hash.put(2, "single");
        
        int goal = Integer.parseInt(br.readLine());

        
        // Prepping the score table
        int mult = 3;
        int[][] grid = new int[3][20];
        for(int i = 0; i < grid.length; i++) {
            
            int score = 20;         
            for(int j = 0; j < grid[0].length; j++) {
                grid[i][j] = mult * score--;
            }
            mult--;
        }
        
        // Calculating this poorly but fine enough for the size!
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                
                int dart1 = grid[i][j];
                
                for(int k = 0; k < grid.length; k++) {
                    for(int l = 0; l < grid[0].length; l++) {
                        
                        int dart2 = grid[k][l];
                        
                        for(int m = 0; m < grid.length; m++) {
                            for(int n = 0; n < grid[0].length; n++) {
                                
                                int dart3 = grid[m][n];
                                
                                int total = dart1 + dart2 + dart3;
                                if(total == goal) {
                                    sb.append(hash.get(i) + " " + (20 - j) + "\n");
                                    sb.append(hash.get(k) + " " + (20 - l) + "\n");
                                    sb.append(hash.get(m) + " " + (20 - n));
                                    
                                    // C-c-c-combo breakerrrrr...
                                    i = 4;
                                    j = 21;
                                    k = 4;
                                    l = 21;
                                    m = 4;
                                    n = 21;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if(sb.length() == 0) {
            if(goal == 2) {
                sb.append("double 1");
            }else if(goal == 1) {
                sb.append("single 1");
            }else if(goal == 0){
                sb.append("");
            }else {
                sb.append("impossible");                
            }
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}
