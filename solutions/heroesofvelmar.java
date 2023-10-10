import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class heroesofvelmar {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Hashtable<String, Integer> hash = getCards();
        
        int oneWins = 0;
        int twoWins = 0;
        
        int onePower = 0;
        int twoPower = 0;
        
        for(int i = 0; i < 3; i++) {
            
            String[] line = br.readLine().split(" ");
            int cardNum = Integer.parseInt(line[0]);
            
            int onePilePower = 0;
            for(int j = 0; j < cardNum; j++) {
                
                String card = line[j + 1];
                int power = hash.get(card);
                onePilePower += power;
                
                if(card.charAt(0) == 'T') {
                    if(cardNum >= 4) {
                        onePilePower += 6;
                    }
                }else if(card.charAt(0) == 'Z') {
                    if(i == 1) {
                        onePilePower += 5;
                    }
                }else if(card.length() == 9){
                    onePilePower += (cardNum - 1);
                }
            }
            
            line = br.readLine().split(" ");
            cardNum = Integer.parseInt(line[0]);
            
            onePower += onePilePower;
            
            int twoPilePower = 0;
            for(int j = 0; j < cardNum; j++) {
                
                String card = line[j + 1];
                int power = hash.get(card);
                twoPilePower += power;
                
                if(card.charAt(0) == 'T') {
                    if(cardNum >= 4) {
                        twoPilePower += 6;
                    }
                }else if(card.charAt(0) == 'Z') {
                    if(i == 1) {
                        twoPilePower += 5;
                    }
                }else if(card.length() == 9){
                    twoPilePower += (cardNum - 1);
                }
            }
            
            twoPower += twoPilePower;
            
            if(onePilePower >= twoPilePower) {
                oneWins++;
            }
            if(twoPilePower >= onePilePower) {
                twoWins++;
            }
            
        }
        
        boolean one = false;
        boolean two = false;
        
        if(oneWins > twoWins) {
            one = true;
        }else if(twoWins > oneWins) {
            two = true;
        }else {
            
            if(onePower > twoPower) {
                one = true;
            }else if(twoPower > onePower) {
                two = true;
            }else {
                one = true;
                two = true;
            }
        }
        
        if(one && two) {
            System.out.println("Tie");
        }else if(one) {
            System.out.println("Player 1");
        }else {
            System.out.println("Player 2");
        }
        
        // Output
        System.out.println("");
        
        br.close();
    }

    private static Hashtable<String, Integer> getCards() {
        
        Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
        
        hash.put("Shadow", 6);
        hash.put("Gale", 5);
        hash.put("Ranger", 4);
        hash.put("Anvil", 7);
        hash.put("Vexia", 3);
        hash.put("Guardian", 8);
        hash.put("Thunderheart", 6);
        hash.put("Frostwhisper", 2);
        hash.put("Voidclaw", 3);
        hash.put("Ironwood", 3);
        hash.put("Zenith", 4);
        hash.put("Seraphina", 1);
        
        return hash;
    }

}

