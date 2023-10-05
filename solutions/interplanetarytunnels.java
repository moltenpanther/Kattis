import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class interplanetarytunnels {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] nums = br.readLine().split(" ");
        int planetNum = Integer.parseInt(nums[0]);
        int tunnels = Integer.parseInt(nums[1]);
        
        String[] astronauts = br.readLine().split(" ");
        int alice = Integer.parseInt(astronauts[0]);
        int bob = Integer.parseInt(astronauts[1]);
        
        Hashtable<Integer, List<Integer>> hash = new Hashtable<Integer, List<Integer>>();
        
        for(int i = 0; i < tunnels; i++) {
            
            String[] tunnel = br.readLine().split(" ");
            int from = Integer.parseInt(tunnel[0]);
            int to = Integer.parseInt(tunnel[1]);
            
            if(!hash.containsKey(from)) {   
                List<Integer> list = new ArrayList<Integer>();
                hash.put(from, list);
            }
            if(!hash.containsKey(to)) { 
                List<Integer> list = new ArrayList<Integer>();
                hash.put(to, list);
            }
            
            hash.get(from).add(to);
            hash.get(to).add(from);         
        }
        
        // BFS
        Planet[] planets = new Planet[planetNum];
        Queue<Planet> queue = new LinkedList<Planet>();
        
        Planet planet = new Planet(alice);
        planet.dis = 0;
        planet.color = 'G';
        
        planets[alice] = planet;
        queue.add(planet);
        
        while(!queue.isEmpty()) {
            
            planet = queue.remove();
            
            if(hash.containsKey(planet.num)) {
                
                List<Integer> list = hash.get(planet.num);
                
                for(int num : list) {
                    
                    if(planets[num] == null) {
                        Planet thisPlanet = new Planet(num);
                        planets[num] = thisPlanet;
                    }
                    
                    Planet thisPlanet = planets[num];
                    
                    if(thisPlanet.color == 'W') {
                        
                        thisPlanet.setDis(planet.dis + 1);
                        thisPlanet.setColor('G');
                        thisPlanet.setPrev(planet);
                        
                        queue.add(thisPlanet);
                    }
                }
                
                planet.setColor('B');
                
            }

        }

        Planet endPlanet = planets[bob];
        int endDis = endPlanet.dis;
        
        int ans = endDis / 2;
        if(endDis % 2 == 0) {
            System.out.println(ans);            
        }else {
            System.out.println(ans + 1);
        }
        
    }

}

class Planet {
    
    int num = 0;
    int dis = Integer.MAX_VALUE;
    Planet prev = null;
    char color = 'W';
    
    public Planet(int num){
        this.num = num;
    }

    public Planet() {
        
    }

    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public int getDis() {
        return dis;
    }


    public void setDis(int dis) {
        this.dis = dis;
    }


    public Planet getPrev() {
        return prev;
    }


    public void setPrev(Planet prev) {
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
    
        return num + ": " + dis;
    }
    
}
