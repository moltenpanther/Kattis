import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wordcloud {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int maxWidth = Integer.parseInt(line[0]);
        int num = Integer.parseInt(line[1]);
        
        int cloud = 0;
        while(maxWidth + num != 0) {
                    
            // Saving the words and counts
            String[] words = new String[num];
            int[] counts = new int[num];
            
            double maxCount = -1;
            for(int i = 0; i < num; i++) {
                
                line = br.readLine().split(" ");
                String word = line[0];
                words[i] = word;
                
                int count = Integer.parseInt(line[1]);
                counts[i] = count;
                
                if(count > maxCount) {
                    maxCount = count;
                }
            }
            
            // Calculating
            int maxHeight = 0;
            int rowHeight = 0;
            int currWidth = 0;
            for(int i = 0; i < num; i++) {
                
                double count = counts[i] - 4;
                int len = words[i].length();
                
                int pointSize = (int) (8 + Math.ceil((40*(count)/(maxCount - 4))));
                int wordWidth = (int) Math.ceil(.5625 * len * pointSize);
                
                // Checking each word
                if(currWidth + wordWidth <= maxWidth) {
                    currWidth += wordWidth + 10;
                    if(rowHeight < pointSize) {
                        rowHeight = pointSize;
                    }
                }else {
                    maxHeight += rowHeight;
                    rowHeight = pointSize;
                    currWidth = wordWidth + 10;
                }    
            }
            
            if(rowHeight > 0) {
                maxHeight += rowHeight;
            }
            
            // Output
            System.out.println("CLOUD " + ++cloud + ": " + maxHeight);
        
            line = br.readLine().split(" ");
            maxWidth = Integer.parseInt(line[0]);
            num = Integer.parseInt(line[1]);
            
        }

        br.close();
    }

}
