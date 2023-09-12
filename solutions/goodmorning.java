import java.util.Scanner;

public class goodmorning {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean[] nums = {false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, true, false, true, true, false, true, true, false, false, false, true, false, false, true, false, false, true, true, false, false, false, true, true, true, true, true, true, true, false, false, false, false, true, true, false, true, true, false, false, false, false, false, false, true, false, false, true, true, false, false, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, false, true, true, false, true, true, false, true, true, false, false, false, true, false, false, true, false, false, true, true, false, false, false, true, true, true, true, true, true, true, false, false, false, false, true, true, false, true, true, false, false, false, false, false, false, true, false, false, true, true, false, false, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, false, false, false, true, true};

        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            
            int time = scan.nextInt();
            
            int ans = 0;
            boolean found = false;
            if(nums[time]) {
                found = true;
                ans = time;
            }
            
            int count = 1;
            while(!found) {
                
                int up = time + count;
                int down = time - count;
                
                if(up < 201) {
                    if(nums[up]) {
                        found = true;
                        ans = up;
                    }   
                }
                
                if(down > 0 && !found) {
                    if(nums[down]) {
                        found = true;
                        ans = down;
                    }
                }
                count++;
            }
            
            // Output
            System.out.println(ans);
        }

        
        scan.close();
    }

}

