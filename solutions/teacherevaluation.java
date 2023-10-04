import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class teacherevaluation {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = br.readLine().split(" ");
        int num = Integer.parseInt(nums[0]);
        int target = Integer.parseInt(nums[1]);
        
        String[] grades = br.readLine().split(" ");
        int sum = 0;
        for(int i = 0; i < num; i++) {
            int grade = Integer.parseInt(grades[i]);
            sum += grade;
        }
        
        int mean = sum / num;
        int count = 0;
        
        if(target == 100 && mean != 100) {
            System.out.println("impossible");
        }else {
            
            while(mean < target) {
                sum += 100;
                count++;
                mean = sum / (num + count);
            }
            
            // Output
            System.out.println(count);
        }
        
        
        br.close();
    }

}
