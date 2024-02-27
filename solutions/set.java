import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class set {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] cards = new String[13];
        int cardIndex = 1;
        for(int i = 0; i < 4; i++) {
            String[] line = br.readLine().split(" ");
            cards[cardIndex++] = line[0];
            cards[cardIndex++] = line[1];
            cards[cardIndex++] = line[2];
        }
        
        for(int i = 1; i <= 10; i++) {
            
            String card1 = cards[i];
            for(int j = i + 1; j <= 11; j++) {
                
                String card2 = cards[j];
                
                // Getting needed values for card3
                char ch1 = getCh1(card1, card2);
                char ch2 = getCh2(card1, card2);
                char ch3 = getCh3(card1, card2);
                char ch4 = getCh4(card1, card2);
                
                String cardNeeded = ch1 + "" + ch2 + "" + ch3 + "" + ch4;
                
                // Checking last card
                for(int k = j + 1; k <= 12; k++) {
                    String card3 = cards[k];
                    if(card3.equals(cardNeeded)) {
                        sb.append(i + " " + j + " " + k);
                        sb.append("\n");
                    }
                }
            }
        }
        
        // Output
        if(sb.toString().isBlank()) {
            sb.append("no sets");
        }
        System.out.print(sb);
        
        br.close();
    }

    public static char getCh1(String card1, String card2) {
        
        char ans = '?';
        char[] chars = {'1', '2', '3'};
        
        char ch1 = card1.charAt(0);
        char ch2 = card2.charAt(0);
        
        if(ch1 == ch2) {
            ans = ch1;
        }else {
            for(int i = 0; i < 3; i++) {
                if(ch1 != chars[i] && ch2 != chars[i]) {
                    ans = chars[i];
                }
            }
        }
        
        return ans;
    }

    public static char getCh2(String card1, String card2) {
        
        char ans = '?';
        char[] chars = {'D', 'S', 'O'};
        
        char ch1 = card1.charAt(1);
        char ch2 = card2.charAt(1);
        
        if(ch1 == ch2) {
            ans = ch1;
        }else {
            for(int i = 0; i < 3; i++) {
                if(ch1 != chars[i] && ch2 != chars[i]) {
                    ans = chars[i];
                }
            }
        }
        
        return ans;
    }

    public static char getCh3(String card1, String card2) {
        
        char ans = '?';
        char[] chars = {'S', 'T', 'O'};
        
        char ch1 = card1.charAt(2);
        char ch2 = card2.charAt(2);
        
        if(ch1 == ch2) {
            ans = ch1;
        }else {
            for(int i = 0; i < 3; i++) {
                if(ch1 != chars[i] && ch2 != chars[i]) {
                    ans = chars[i];
                }
            }
        }
        
        return ans;
    }

    public static char getCh4(String card1, String card2) {
        
        char ans = '?';
        char[] chars = {'R', 'G', 'P'};
        
        char ch1 = card1.charAt(3);
        char ch2 = card2.charAt(3);
        
        if(ch1 == ch2) {
            ans = ch1;
        }else {
            for(int i = 0; i < 3; i++) {
                if(ch1 != chars[i] && ch2 != chars[i]) {
                    ans = chars[i];
                }
            }
        }
        
        return ans;
    }

}
