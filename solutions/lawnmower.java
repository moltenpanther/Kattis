import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;

public class lawnmower {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        double xNum = Double.parseDouble(line[0]);
        double yNum = Double.parseDouble(line[1]);
        double width = Double.parseDouble(line[2]) / 2;
        
        while(xNum != 0 || yNum != 0 || width != 0) {
            
            double x = 75;
            double y = 100;
            
            // Checking both directions
            boolean xGood = false;
            boolean yGood = false;
            
            line = br.readLine().split(" ");
            xGood = checkMow(line, width, x);
            
            line = br.readLine().split(" ");
            if(xGood) {
                yGood = checkMow(line, width, y);           
            }
                    
            // Output
            if(xGood && yGood) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            
            line = br.readLine().split(" ");
            xNum = Double.parseDouble(line[0]);
            yNum = Double.parseDouble(line[1]);
            width = Double.parseDouble(line[2]) / 2;
        
        }
        
        br.close();
    }
    
    public static boolean checkMow(String[] line, double width, double goal) {
        
        Hashtable<Double, Double> hash =  new Hashtable<Double, Double>();
        double[] froms = new double[line.length];
        
        for(int i = 0; i < line.length; i++) {
            
            double middle = Double.parseDouble(line[i]);
            double from = middle - width;
            double to = middle + width;
            
            froms[i] = from;
            hash.put(from, to);
        }
        
        Arrays.sort(froms);
        
        // Checking x
        boolean good = true;
        double max = 0;
        for(int i = 0; i < froms.length; i++) {
            
            double from = froms[i];
            double to = hash.get(from);
                        
            if(from <= max) {
                max = to;
            }else {
                good = false;
            }
            
            if(max >= goal) {
                break;
            }
        }
        
        if(max < goal) {
            good = false;
        }

        return good;
    }
    
}

