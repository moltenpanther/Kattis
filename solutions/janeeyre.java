import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class janeeyre {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        long unread = Long.parseLong(line[0]);
        long gifted = Long.parseLong(line[1]);
        long pagesInJE = Long.parseLong(line[2]);
        
        Hashtable<String, Long> books = new Hashtable<String, Long>();
        PriorityQueue<String> pile = new PriorityQueue<String>();
        
        String goal = "Jane Eyre";
        
        books.put(goal, pagesInJE);
        pile.add(goal);
        
        for(long i = 0; i < unread; i++) {
            line = br.readLine().split("\"");
            
            String title = line[1];
            long pages = Long.parseLong(line[2].trim());
            
            books.put(title, pages);
            pile.add(title);
        }
        
        Hashtable<Long, List<String>> gift = new Hashtable<Long, List<String>>();
        PriorityQueue<Long> giftPile = new PriorityQueue<Long>();
        
        for(long i = 0; i < gifted; i++) {
            line = br.readLine().split("\"");
            
            long time = Long.parseLong(line[0].trim());
            String title = line[1];
            long pages = Long.parseLong(line[2].trim());
            
            books.put(title, pages);
            
            if(!gift.containsKey(time)) {
                List<String> list = new LinkedList<String>();
                gift.put(time, list);
            }
            
            gift.get(time).add(title);
            giftPile.add(time);
        }
        
        
        // Processing
        boolean done = false;
        BigInteger now = BigInteger.ZERO;
        while(!done) {
            
            if(!giftPile.isEmpty()) {
                long nextGift = giftPile.peek();
                
                while(now.compareTo(BigInteger.valueOf(nextGift)) >= 0) {
                    nextGift = giftPile.peek();
                    
                    List<String> list = gift.get(nextGift);
                    for(String title : list) {
                        giftPile.remove();
                        pile.add(title);
                    }
                    
                    if(!giftPile.isEmpty()) {
                        nextGift = giftPile.peek();                     
                    }else {
                        nextGift = Long.MAX_VALUE;
                    }
                    
                }
            }
            
            
            String nextBook = pile.remove();
            long nextBookPages = books.get(nextBook);
            
            now = now.add(BigInteger.valueOf(nextBookPages));
            if(nextBook.equals(goal)){
                done = true;
            }
       //   System.out.println(nextBook + " - " + nextBookPages + " = " + now);
        }
        
        // Output
        System.out.println(now);
        
        br.close();
    }

}

