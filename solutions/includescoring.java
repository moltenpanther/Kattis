import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;

public class includescoring {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<String, Integer> matchCount = new Hashtable<String, Integer>();
        
        int num = Integer.parseInt(br.readLine());
        int[] scores = {100, 75, 60, 50, 45, 40, 36, 32, 29, 26, 24, 22, 20, 18, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Contestant[] list = new Contestant[num];        
        
        for(int i = 0; i < num; i++) {
            
            String stats = br.readLine();
            String[] line = stats.split(" ");
            
            int problems = Integer.parseInt(line[0]);
            int timePenalty = Integer.parseInt(line[1]);
            int finalTime = Integer.parseInt(line[2]);
            int onSite = Integer.parseInt(line[3]);
            
            Contestant contestant = new Contestant(i, stats, problems, timePenalty, finalTime, onSite);
            list[i] = contestant;
            
            String statsSub = stats.substring(0, stats.length() - 1);
            
            if(matchCount.containsKey(statsSub)) {
                int val = matchCount.get(statsSub);
                matchCount.replace(statsSub, ++val);
            }else {
                matchCount.put(statsSub, 1);
            }
        }
        
        Arrays.sort(list, Comparator.comparing(Contestant::getProblems).reversed().thenComparing(Contestant::getTimePenalty).thenComparing(Contestant::getFinalTime).thenComparing(Contestant::getScore));

        for(int i = 0; i < scores.length && i < list.length; i++) {
            
            String stats = list[i].getStats();
            String statsSub = stats.substring(0, stats.length() - 1);

            double match = matchCount.get(statsSub);
            
            double scoreSum = 0;
            for(int j = 0; j < match; j++) {
                if(i + j < scores.length) {
                    scoreSum += scores[i + j];                  
                }
            }
            int average = (int) Math.ceil(scoreSum / match);
            for(int j = 0; j < match; j++) {
                list[i + j].setScore(average);
            }
            i += match - 1;
        }
        
        Arrays.sort(list, Comparator.comparing(Contestant::getOrder));
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.length; i++) {
            Contestant contestant = list[i];
            sb.append(contestant.getScore() + "\n");
        }

        // Output
        System.out.print(sb);
        
        br.close();
    }

}

class Contestant {
    
    String stats;
    int order;
    int problems;
    int timePenalty;
    int finalTime;
    int onSite;
    int score;
    
    public Contestant(int order, String stats, int problems, int timePenalty, int finalTime, int onSite) {
        this.order = order;
        this.stats = stats;
        this.problems = problems;
        this.timePenalty = timePenalty;
        this.finalTime = finalTime;
        this.onSite = onSite;
        
        if(onSite == 1) {
            score++;
        }
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getStats() {
        return stats;
    }
    
    public int getProblems() {
        return problems;
    }
    
    public int getTimePenalty() {
        return timePenalty;
    }
    
    public int getFinalTime() {
        return finalTime;
    }
    
    public int getOnSite() {
        return onSite;
    }
    
    public void setStats(String stats) {
        this.stats = stats;
    }
    
    public void setProblems(int problems) {
        this.problems = problems;
    }
    
    public void setTimePenalty(int timePenalty) {
        this.timePenalty = timePenalty;
    }
    
    public void setFinalTime(int finalTime) {
        this.finalTime = finalTime;
    }
    
    public void setOnSite(int onSite) {
        this.onSite = onSite;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }
    
}
