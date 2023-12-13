import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class parentgap {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int year = Integer.parseInt(br.readLine());

        LocalDate fathersDayTest = LocalDate.of(year, 5, 1)
                .with(DayOfWeek.SUNDAY)
                .plusWeeks(6);
       
        LocalDate fathersDay = LocalDate.of(year, 6, 1)
                .with(DayOfWeek.SUNDAY)
                .plusWeeks(2);

        boolean five = fathersDayTest.equals(fathersDay);
        
        // Output
        if(five) {
            System.out.println("5 weeks");
        }else {
            System.out.println("6 weeks");          
        }
        
        br.close();
    }

}
