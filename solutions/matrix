import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrix {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line = "";
        int num = 0;
        while((line = br.readLine()) != null) {
            
            String[] row1 = line.split(" ");
            String[] row2 = br.readLine().split(" ");
            
            double a = Double.parseDouble(row1[0]);
            double b = Double.parseDouble(row1[1]);
            double c = Double.parseDouble(row2[0]);
            double d = Double.parseDouble(row2[1]);
            
            double det = a * d - b * c;
            
            double temp = a;
            a = d;
            d = temp;
            b *= -1;
            c *= -1;
            
            a /= det;
            b /= det;
            c /= det;
            d /= det;
            
            sb.append("Case " + ++num + ":\n");
            sb.append((int)a + " " + (int)b + "\n");
            sb.append((int)c + " " + (int)d + "\n");
            
            br.readLine();
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}
