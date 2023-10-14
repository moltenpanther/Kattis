import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class glitchbot {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int xGoal = Integer.parseInt(line[0]);
        int yGoal = Integer.parseInt(line[1]);
        
        int num = Integer.parseInt(br.readLine());
        
        String[] dirs = new String[num];
        for(int i = 0; i < num; i++) {
            dirs[i] = br.readLine();
        }
        
        int indexChange = 0;
        boolean good = false;
        while(!good) {
            
            String[] checkDirs = {"Forward", "Left", "Right"};
            
            for(int i = 0; i < 3; i++) {
                
                int x = 0;
                int y = 0;
                char face = 'N'; // E, S, W
                String checkDir = checkDirs[i];
                for(int j = 0; j < num; j++) {
                    
                    String dir = dirs[j];
                    if(j == indexChange) {
                        dir = checkDir;
                    }
                    
                    if(dir.charAt(0) == 'F') {
                        if(face == 'N') {
                            y++;
                        }else if(face == 'S') {
                            y--;
                        }else if(face == 'E') {
                            x++;
                        }else if(face == 'W') {
                            x--;
                        }
                    }else if(dir.charAt(0) == 'L') {
                        if(face == 'N') {
                            face = 'W';
                        }else if(face == 'S') {
                            face = 'E';
                        }else if(face == 'E') {
                            face = 'N';
                        }else if(face == 'W') {
                            face = 'S';
                        }
                    }else if(dir.charAt(0) == 'R') {
                        if(face == 'N') {
                            face = 'E';
                        }else if(face == 'S') {
                            face = 'W';
                        }else if(face == 'E') {
                            face = 'S';
                        }else if(face == 'W') {
                            face = 'N';
                        }
                    }
                }

                // Output
                if(x == xGoal && y == yGoal) {
                    System.out.println(++indexChange + " " + checkDir);
                    good = true;
                    break;
                }               
                
            }
            
            indexChange++;
        }
        
        br.close();
    }

}
