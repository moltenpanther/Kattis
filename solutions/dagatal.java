import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dagatal {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int month = Integer.parseInt(br.readLine());
        
        int days = 0;
        
        if(month == 2){
            days = 28;
        }else if(month == 9 || month == 4 || month == 6 || month == 11){
            days = 30;
        }else{
            days = 31;
        }

        // Output
        System.out.println(days);

        br.close();
    }

}
