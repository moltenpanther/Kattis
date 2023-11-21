import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class juryjeopardy {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        sb.append(num + "\n");
        
        for(int k = 0; k < num; k++) {
            
            HashSet<int[]> coords = new HashSet<int[]>();
            
            // L, U, R, D
            char facing = 'R';
            
            int iMin = Integer.MAX_VALUE;
            int iMax = 0;
            int jMax = 0;
            
            int[] coord = {0, 0};
            coords.add(coord);
            
            String line = br.readLine();
            for(int i = 0; i < line.length(); i++) {
                
                char ch = line.charAt(i);
                
                // Finding Coords
                if(ch == 'F') {
                    if(facing == 'U') {
                        coord[0]--;
                    }else if(facing == 'D') {
                        coord[0]++;
                    }else if(facing == 'L') {
                        coord[1]--;
                    }else if(facing == 'R') {
                        coord[1]++;
                    }
                }else if(ch == 'L') {
                    if(facing == 'U') {
                        facing = 'L';
                        coord[1]--;
                    }else if(facing == 'D') {
                        facing = 'R';
                        coord[1]++;
                    }else if(facing == 'L') {
                        facing = 'D';
                        coord[0]++;
                    }else if(facing == 'R') {
                        facing = 'U';
                        coord[0]--;
                    }
                }else if(ch == 'R') {
                    if(facing == 'U') {
                        facing = 'R';
                        coord[1]++;
                    }else if(facing == 'D') {
                        facing = 'L';
                        coord[1]--;
                    }else if(facing == 'L') {
                        facing = 'U';
                        coord[0]--;
                    }else if(facing == 'R') {
                        facing = 'D';
                        coord[0]++;
                    }
                }else if(ch == 'B'){
                    if(facing == 'U') {
                        facing = 'D';
                        coord[0]++;
                    }else if(facing == 'D') {
                        facing = 'U';
                        coord[0]--;
                    }else if(facing == 'L') {
                        facing = 'R';
                        coord[1]++;
                    }else if(facing == 'R') {
                        facing = 'L';
                        coord[1]--;
                    }
                }
                
                int[] newCoord = {coord[0], coord[1]};
                coords.add(newCoord);
                
                if(coord[0] < iMin) {
                    iMin = coord[0];
                }
                if(coord[0] > iMax) {
                    iMax = coord[0];
                }
                if(coord[1] > jMax) {
                    jMax = coord[1];
                }
                
            }
            
            // Make walled map
            int iDif = (iMax - iMin) + 1;
    
            char[][] map = new char[iDif + 2][jMax + 2];
            for(int i = 0; i < iDif + 2; i++) {
                for(int j = 0; j < jMax + 2; j++) {
                    map[i][j] = '#';
                }
            }
            
            // Fill path with dots
            for(int[] dot : coords) {
                map[(dot[0] - iMin + 1)][dot[1]] = '.';
            }
            
            sb.append(map.length + " " + map[0].length + "\n");
            // Print map
            for(int i = 0; i < iDif + 2; i++) {
                for(int j = 0; j < jMax + 2; j++) {
                    sb.append(map[i][j]);
                }
                sb.append("\n");
            }
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
