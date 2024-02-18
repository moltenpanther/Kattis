import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lyklagangriti {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Letter cursor = new Letter("");
        String line = br.readLine();
        
        for(int i = 0; i < line.length(); i++) {
            
            String ch = line.substring(i, i + 1);
            Letter letter = new Letter(ch);
            
            Letter before = cursor.getBefore();
            Letter after = cursor.getAfter();
            
            // Move cursor left
            if(ch.equals("L")) {
                cursor.setAfter(before);
                cursor.setBefore(before.getBefore());
                
            // Move cursor right
            }else if(ch.equals("R")) {
                cursor.setBefore(after);
                cursor.setAfter(after.getAfter());
                
            // Backspace
            }else if(ch.equals("B")) {
                
                Letter twoBack = before.getBefore();
                
                // Cursor at the end
                if(after == null) {
                    
                    // Only one character before
                    if(twoBack == null) {
                        cursor.setBefore(null);
                        
                    // More than one character before
                    }else {
                        twoBack.setAfter(null);
                        cursor.setBefore(twoBack);
                    }
                    
                // Cursor in middle
                }else {
                    
                    // Only one character before
                    if(twoBack == null) {
                        after.setBefore(null);
                        cursor.setBefore(null);
                        
                    // More than one character before
                    }else {
                        twoBack.setAfter(after);
                        after.setBefore(twoBack);
                        cursor.setBefore(twoBack);
                    }
                }
            
            // Add a letter
            }else {
                
                letter = new Letter(ch);
                cursor.setBefore(letter);
                
                // Cursor at the end
                if(after == null) {
                    
                    // At least one letter before
                    if(before != null) {
                        letter.setBefore(before);
                        before.setAfter(letter);
                    }
                    
                // At least one letter after
                }else {
                    
                    // Cursor at start
                    if(before == null) {
                        letter.setAfter(after);
                        after.setBefore(letter);
                    
                    // Cursor in middle
                    }else {
                        letter.setBefore(before);
                        letter.setAfter(after);
                        before.setAfter(letter);
                        after.setBefore(letter);
                    }
                }
            }
        }

        ////////////////////////////////////////
        ////////////////////////////////////////
        // Rewinding to the start
        while(cursor.getBefore() != null) {
            cursor = cursor.getBefore();
        }
        
        // Printing
        while(cursor.getAfter() != null) {
            sb.append(cursor.getCh());
            cursor = cursor.getAfter();
        }
        sb.append(cursor.getCh());
        
        String ans = sb.toString();
        
        // Output
        boolean dollar = false;
        if(ans.length() == 1) {
            if(ans.equals("$")) {
                dollar = true;
            }
        }
        
        if(!dollar) {
            System.out.print(sb);
        }else {
            System.out.println("");
        }
        
        br.close();
    }

}

class Letter {
    
    String ch;
    Letter before;
    Letter after;
    
    public Letter(String ch) {
        this.ch = ch;
    }
    
    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public Letter getBefore() {
        return before;
    }
    
    public void setBefore(Letter before) {
        this.before = before;
    }
    
    public Letter getAfter() {
        return after;
    }
    
    public void setAfter(Letter after) {
        this.after = after;
    }

    @Override
    public String toString() {
        return ch + "";
    }
    
}
