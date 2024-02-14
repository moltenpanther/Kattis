import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeMap;

public class kattissquest {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        TreeMap<Quest, Integer> queue = new TreeMap<Quest, Integer>(Comparator.comparing(Quest::getEnergy).reversed().thenComparing(Comparator.comparing(Quest::getGold).reversed()));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] line = br.readLine().split(" ");
            
            // Add a quest
            if(line.length == 3) {
                
                int energy = Integer.parseInt(line[1]);
                int gold = Integer.parseInt(line[2]); 
                
                Quest quest = new Quest(energy, gold);
                if(queue.containsKey(quest)) {
                    int val = queue.get(quest) + 1;
                    queue.replace(quest, val);
                }else {
                    queue.put(quest, 1);                    
                }
            
            // Query
            }else {
                
                int energy = Integer.parseInt(line[1]);
                long total = 0;
                while(!queue.isEmpty() && energy > 0) {
                    
                    Quest quest = queue.ceilingKey(new Quest(energy, 1000000));
                    
                    if(quest == null) {
                        energy = 0;
                    }else {
                        
                        int val = queue.get(quest);
                        if(val > 1) {
                            queue.replace(quest, val - 1);
                        }else {
                            queue.remove(quest);
                        }
                        
                        energy -= quest.getEnergy();
                        total += quest.getGold();
                    }
                }
                sb.append(total + "\n");
            }
        }
        
        // Output
        System.out.println(sb);
        
        br.close();
    }

}

class Quest {
    
    int energy = 0;
    int gold = 0;
    
    public Quest(int energy, int gold) {
        this.energy = energy;
        this.gold = gold;
    }
    
    public Quest(int energy) {
        this.energy = energy;
    }
    
    public int getEnergy() {
        return energy;
    }
    
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public int getGold() {
        return gold;
    }
    
    public void setGold(int gold) {
        this.gold = gold;
    }
    
}
