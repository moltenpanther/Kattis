import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class torn2pieces {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        
        Hashtable<String, List<String>> hash = new Hashtable<String, List<String>>();
        
        // Loading the Adjacency List
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            String from = line[0];
            
            if(!hash.containsKey(from)) {   
                List<String> list = new ArrayList<String>();
                hash.put(from, list);
            }
            
            for(int j = 1; j < line.length; j++){
                
                String to = line[j];
                
                if(!hash.containsKey(to)) { 
                    List<String> list = new ArrayList<String>();
                    hash.put(to, list);
                }
                
                hash.get(from).add(to);
                hash.get(to).add(from);         
                                
            }
            
        }
        
        line = br.readLine().split(" ");
        String from = line[0];
        String to = line[1];
        
        // BFS
        Hashtable<String, Station> stations = new Hashtable<String, Station>();
        Queue<Station> queue = new LinkedList<Station>();
        
        Station station = new Station(from);
        station.dis = 0;
        station.color = 'G';
        
        stations.put(from, station);
        queue.add(station);
        
        while(!queue.isEmpty()) {
            
            station = queue.remove();
            
            if(hash.containsKey(station.name)) {
                
                List<String> list = hash.get(station.name);
                
                for(String name : list) {
                    
                    if(!stations.containsKey(name)) {
                        Station thisStation = new Station(name);
                        stations.put(name, thisStation);
                    }
                    
                    Station thisStation = stations.get(name);
                    
                    if(thisStation.color == 'W') {
                        
                        thisStation.setDis(station.dis + 1);
                        thisStation.setColor('G');
                        thisStation.setPrev(station);
                        
                        queue.add(thisStation);
                    }
                }
                
                station.setColor('B');
                
            }
            
        }
        
        Station thisStation = stations.get(to);
        String ans = to;

        boolean found = false;
        while(thisStation != null && !found) {
            
            thisStation = thisStation.prev;
            ans = thisStation.name + " " + ans;
            
            if(thisStation.name.equals(from)) {
                found = true;
            }
            
        }
        
        if(found) {
            System.out.println(ans);                        
        }else {
            System.out.println("no route found");
        }
        
    }

}

class Station {
    
    String name = "";
    int dis = Integer.MAX_VALUE;
    Station prev = null;
    char color = 'W';
    
    public Station(String name){
        this.name = name;
    }

    public Station() {
        
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getDis() {
        return dis;
    }


    public void setDis(int dis) {
        this.dis = dis;
    }


    public Station getPrev() {
        return prev;
    }


    public void setPrev(Station prev) {
        this.prev = prev;
    }


    public char getColor() {
        return color;
    }


    public void setColor(char color) {
        this.color = color;
    }


    @Override
    public String toString() {
    
        return name + ": " + dis;
    }
    
}

