import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class gitgood {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        
        // Loop
        HashSet<String> set = new HashSet<>();
        LinkedList<String> files = new LinkedList<>();
        Stack<String> dirs = new Stack<>();

        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            String cmd = line[0];
            String name = line[1];
            
            // nano
            if(cmd.charAt(0) == 'n') {

                StringBuilder file = new StringBuilder();
                for(String dir : dirs) {
                    file.append(dir);
                }
                file.append(name);

                String filename = file.toString();

                if(!set.contains(filename)) {
                    files.add(filename);
                    set.add(filename);
                }
                
                
            // cd
            } else if(cmd.charAt(0) == 'c') {

                if(name.equals("..")) {
                    dirs.pop();
                } else {
                    dirs.push(name + "/");
                }

            }

        }

        Collections.sort(files);
        for(String file : files) {
            sb.append("git add ").append(file).append("\n");
        }
        sb.append("git commit\n");
        sb.append("git push");

        // Output
        System.out.println(sb);

        br.close();
    }

}
