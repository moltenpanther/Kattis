import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class hofundaleit {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] line = br.readLine().split(" ");
        int numBooks = Integer.parseInt(line[0]);
        int numWants = Integer.parseInt(line[1]);
        
        Book[] books = new Book[numBooks];
        for(int i = 0; i < numBooks; i++) {
            
            line = br.readLine().split(" ");
            
            String title = line[0].substring(0, line[0].length() - 1);
            String[] author = line[1].split("_");
            String first = author[0];
            String last = author[0];
            
            Book book = new Book(title, first, last);
            books[i] = book;
        }
        
        Arrays.sort(books, Comparator.comparing(Book::getLast).thenComparing(Book::getFirst).thenComparing(Book::getTitle));
        
        HashMap<String, Integer> cardCatalog = new HashMap<String, Integer>();
        for(int i = 0; i < numBooks; i++) {
            cardCatalog.put(books[i].getTitle(), i + 1);
        }
        
        for(int i = 0; i < numWants; i++) {
            
            String want = br.readLine();
            if(cardCatalog.containsKey(want)) {
                sb.append(cardCatalog.get(want));
            }else {
                sb.append(-1);
            }
            sb.append("\n");
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}

class Book {
    
    String title;
    String first;
    String last;
    
    public Book(String title, String first, String last) {
        this.title = title;
        this.first = first;
        this.last = last;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    
}
