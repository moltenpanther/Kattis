import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ooohisee {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        String[] line = br.readLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        
        String[][] grid = new String[rows][cols];

        // Loop
        for(int i = 0; i < rows; i++) {
            String row = br.readLine();
            for (int j = 0; j < cols; j++) {
                grid[i][j] = String.valueOf(row.charAt(j));        
            }
        }

        int count = 0;
        int row = 0;
        int col = 0;

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j].equals("0")){

                    boolean isSurrounded = true;
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            if (x == 0 && y == 0) continue;
                            int newRow = i + x;
                            int newCol = j + y;
                            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                                if (!grid[newRow][newCol].equals("O")) {
                                    isSurrounded = false;
                                    break;
                                }
                            } else {
                                isSurrounded = false;
                                break;
                            }
                        }
                        if (!isSurrounded) {
                            break;
                        }
                    }

                    if (isSurrounded) {
                        count++;
                        row = i;
                        col = j;
                    }

                }
            }
        }

        if(count == 1) {
            sb.append((row + 1) + " " + (col + 1));
        } else if(count > 1) {
            sb.append("Oh no! " + count + " locations");
        } else {
            sb.append("Oh no!");
        }
        // Output
        System.out.println(sb);

        br.close();
    }

}
