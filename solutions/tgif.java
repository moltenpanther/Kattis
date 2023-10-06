import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class tgif {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Hashtable<String, Integer> months = getMonths();
        Hashtable<String, Integer> days = getDays();
        
        String[] line = br.readLine().split(" ");
        int day = Integer.parseInt(line[0]);
        int month = months.get(line[1]) - 1;
        
        int jan1 = days.get(br.readLine());
        
        int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sum = 0;
        for(int i = 1; i <= month; i++) {
            sum += daysInMonths[i];
        }
        sum += day;
        
        int week = 0;
        int dayOfTheWeek = jan1;
        int[][] calendar = new int[53][7];
        for(int i = 1; i <= sum; i++) {
            calendar[week][dayOfTheWeek++] = i;
            if(dayOfTheWeek > 6) {
                dayOfTheWeek = 0;
                week++;
            }
        }
        
        dayOfTheWeek--;
        if(dayOfTheWeek < 0) {
            dayOfTheWeek = 6;
        }
        
        // Output
        if(sum > 60) {
            if(dayOfTheWeek == 5 || dayOfTheWeek == 4) {
                System.out.println("not sure");
            }else {
                System.out.println(":(");
            }
        }else if(dayOfTheWeek == 5) {
            System.out.println("TGIF");
        }else {
            System.out.println(":(");
        }
                
        br.close();
    }

    private static Hashtable<String, Integer> getMonths() {

        Hashtable<String, Integer> months = new Hashtable<String, Integer>();
        
        months.put("JAN", 1);
        months.put("FEB", 2);
        months.put("MAR", 3);
        months.put("APR", 4);
        months.put("MAY", 5);
        months.put("JUN", 6);
        months.put("JUL", 7);
        months.put("AUG", 8);
        months.put("SEP", 9);
        months.put("OCT", 10);
        months.put("NOV", 11);
        months.put("DEC", 12);
        
        return months;
    }

    private static Hashtable<String, Integer> getDays() {

        Hashtable<String, Integer> days = new Hashtable<String, Integer>();
        
        days.put("SUN", 0);
        days.put("MON", 1);
        days.put("TUE", 2);
        days.put("WED", 3);
        days.put("THU", 4);
        days.put("FRI", 5);
        days.put("SAT", 6);
        
        return days;
    }
}
