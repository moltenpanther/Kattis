import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trapizza {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double diameter = Integer.parseInt(br.readLine());
        
        double side1 = Integer.parseInt(br.readLine());
        double side2 = Integer.parseInt(br.readLine());
        double height = Integer.parseInt(br.readLine());
        
        double areaMahjong = Math.PI * Math.pow(diameter / 2, 2);
        double areaTrapizza = (side1 + side2) * height / 2;
        
        // Output
        if(areaMahjong > areaTrapizza) {
            System.out.println("Mahjong!");
        }else if(areaTrapizza > areaMahjong) {
            System.out.println("Trapizza!");
        }else {
            System.out.println("Jafn storar!");
        }
        
        br.close();
    }

}
