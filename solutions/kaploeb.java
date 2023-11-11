import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

public class kaploeb {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<Integer, Racer> hash = new HashMap<Integer, Racer>();
        LinkedList<Racer> finishers = new LinkedList<Racer>();
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        int laps = Integer.parseInt(line[1]);
        
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            int racerNum = Integer.parseInt(line[0]);
            String time = line[1];
            
            if(!hash.containsKey(racerNum)) {
                Racer racer = new Racer(racerNum);
                hash.put(racerNum, racer);
            }
            
            Racer racer = hash.get(racerNum);
            
            racer.addTime(time);
            racer.addLap();
            hash.replace(racerNum, racer);
            
            if(racer.getLaps() == laps) {
                finishers.add(racer);
            }
            
        }
        
        Collections.sort(finishers, Comparator.comparingDouble(Racer::getTime).thenComparingInt(Racer::getNum));

        // Output
        for(Racer racer : finishers) {
            System.out.println(racer.getNum());
        }
        
        br.close();
    }

}

class Racer {
    
    int num = 0;
    double time = 0;
    int laps = 0;
    
    public Racer(int num) {
        this.num = num;
        this.time = 0;
        this.laps = 0;
    }

    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public double getTime() {
        return time;
    }
    
    public void addTime(String time) {
        
        String[] split = (time).split("\\.");
        
        int minutes = Integer.parseInt(split[0]);
        int seconds = Integer.parseInt(split[1]);
        
        this.time += (minutes * 60) + seconds;
    }
    
    public int getLaps() {
        return laps;
    }
    
    public void addLap() {
        this.laps++;
    }
    
}
