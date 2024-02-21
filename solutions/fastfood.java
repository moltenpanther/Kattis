import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fastfood {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = Integer.parseInt(br.readLine());
        for(int h = 0; h < cases; h++) {
            
            String[] line = br.readLine().split(" ");
            int numPrizes = Integer.parseInt(line[0]);
            int numStickers = Integer.parseInt(line[1]);
            
            String[] prizes = new String[numPrizes];
            
            // Reading in prizes
            for(int i = 0; i < numPrizes; i++) {
                String prize = br.readLine();
                prizes[i] = prize;
            }
            
            // Counting stickers
            int[] stickers = new int[numStickers];
            line = br.readLine().split(" ");
            for(int i = 0; i < numStickers; i++) {
                int count = Integer.parseInt(line[i]);
                stickers[i] = count;
            }
            
            // Calculating prizes
            int total = 0;
            for(int i = 0; i < numPrizes; i++) {
                
                int min = Integer.MAX_VALUE;
                String[] prize = prizes[i].split(" ");
                for(int j = 1; j < prize.length - 1; j++) {
                    
                    int sticker = Integer.parseInt(prize[j]);
                    int count = stickers[sticker - 1];
                    if(count < min) {
                        min = count;
                    }
                }
                
                int money = Integer.parseInt(prize[prize.length - 1]);
                total += min * money;
            }
            
            // Output
            System.out.println(total);
        }
        
        br.close();
    }

}
