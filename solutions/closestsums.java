import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class closestsums {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int caseCount = 1;
        
        String line = "";
        while((line = br.readLine()) != null) {
            
            int num = Integer.parseInt(line);
            int[] nums = new int[num];
            
            for(int i = 0; i < num; i++) {
                int in = Integer.parseInt(br.readLine());
                nums[i] = in;
            }
            
            LinkedList<Integer> list = new LinkedList<Integer>();
            HashSet<Integer> hash = new HashSet<Integer>();
            
            for(int i = 0; i < num; i++) {
                for(int j = i + 1; j < num; j++) {
                    int sum = nums[i] + nums[j];
                    if(!hash.contains(sum)) {
                        hash.add(sum);
                        list.add(sum);
                    }
                }
            }
            
            Collections.sort(list);
            
            num = Integer.parseInt(br.readLine());
            sb.append("Case ");
            sb.append(caseCount);
            sb.append(":\n");
            
            for(int i = 0; i < num; i++) {
                
                int check = Integer.parseInt(br.readLine());
                int ans = 0;
                
                if(check < list.get(0)) {
                    ans = list.get(0);
                }else {
                    
                    int min = Integer.MIN_VALUE;
                    int max = Integer.MAX_VALUE;
                    
                    for(int sum : list) {
                        if(sum > check) {
                            max = sum;
                            break;
                        }
                        min = sum;
                    }
                    
                    ans = max;
                
                    if(check - min <= max - check) {
                        ans = min;
                    }
                }
                
                sb.append("Closest sum to ");
                sb.append(check);
                sb.append(" is ");
                sb.append(ans);
                sb.append(".\n");
                
            }
            
            caseCount++;
        }
        
        System.out.println(sb);
        
        br.close();
    }

}
