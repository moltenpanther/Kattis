import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class dreamer {
    
    static int min = Integer.MAX_VALUE;
    static HashSet<Integer> hash;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cases = Integer.parseInt(br.readLine());
        for(int h = 0; h < cases; h++) {
            
            min = Integer.MAX_VALUE;
            hash = new HashSet<Integer>();
            
            String line = br.readLine();
            int[] digits = new int[8];
            
            // Reading in
            int count = 0;
            for(int i = 0; i < line.length(); i++) {
                int num = Character.getNumericValue(line.charAt(i));
                if(num >= 0) {
                    digits[count++] = num;
                }
            }
            
            // Permutating
            getDates(digits, 8);
            
            // Setting up output
            if(hash.size() != 0) {
                
                String dateStr = min + "";
                
                String dd = dateStr.substring(6);
                String mm = dateStr.substring(4, 6);
                String yyyy = dateStr.substring(0, 4);
                
                // Output
                sb.append(hash.size() + " ");
                sb.append(dd + " ");
                sb.append(mm + " ");
                sb.append(yyyy + "\n");
            }else {
                sb.append(0 + "\n");
            }

        }
        System.out.print(sb);
        
        br.close();
    }
    
    // Implementing Heap's algorithm
    static void getDates(int digits[], int size) {
        
        if(size == 1) {
            testDate(digits);
        }else {
            
            getDates(digits, size - 1);
            
            for(int i = 0; i <  size - 1; i++) {
                
                if(size % 2 == 0) {
                    int temp = digits[i];
                    digits[i] = digits[size - 1];
                    digits[size - 1] = temp;
                }else {
                    int temp = digits[0];
                    digits[0] = digits[size - 1];
                    digits[size - 1] = temp;
                }
                
                getDates(digits, size - 1);
            }
        }
    }
    
    // Testing date validity to add to the hash
    public static void testDate(int[] digits) {
        
        // Days by month
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Month check
        int month = Integer.parseInt(digits[2] + "" + digits[3]);
        int year = Integer.parseInt(digits[4] + "" + digits[5] + "" + digits[6] + "" + digits[7]);
        int day = Integer.parseInt(digits[0] + "" + digits[1]);
        
        // Leap check
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            days[2]++;
        }
        
        // Boolean checks
        boolean yearCheck = year > 1999;
        if(!yearCheck) {
            return;
        }
        boolean monthCheck = month > 0 && month < 13;
        if(!monthCheck) {
            return;
        }
        boolean dayCheck = day > 0 && day <= days[month];
        if(!dayCheck) {
            return;
        }
    
        // Checking for earliest
        // If a date is here, it *should* be valid
        int date = year * 10000 + month * 100 + day;
        hash.add(date);
        if(date < min) {
            min = date;
        }
    }
    
}
