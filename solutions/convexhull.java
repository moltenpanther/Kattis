import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.TreeMap;

public class convexhull {
    
    public static void main(String[] args) throws IOException {
        
        // This took a lot of learning... I hope it works!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        while(num != 0) {
            
            int startY = Integer.MAX_VALUE;
            int startX = Integer.MAX_VALUE;
            int startIndex = -1;
            
            // Filling the queue
            Coord[] coords = new Coord[num];
            for(int i = 0; i < num; i++) {
                
                String[] line = br.readLine().split(" ");
                int x = Integer.parseInt(line[0]);
                int y = Integer.parseInt(line[1]);
                
                Coord coord = new Coord(x, y);
                if(y < startY || (y == startY && x < startX)) {
                    startY = y;
                    startX = x;
                    startIndex = i;
                }
                
                coords[i] = coord;
            }
            
            // Pulling out the starting point
            Coord p0 = coords[startIndex];
            
            // Setting up the Polars (getting rid of duplicates)
            TreeMap<Double, Coord> polars = new TreeMap<Double, Coord>();
            
            for(int i = 0; i < num; i++) {
                if(i != startIndex) {
                    
                    Coord coord = coords[i];
                    coord.setPolar(p0);
                    
                    double polar = coord.getPolar();
                    if(polar != 0.0 || coord.getX() != p0.getX() || coord.getY() != p0.getY()) {
                        
                        Coord inTree = polars.get(polar);
                        if(inTree != null) {
                            if(coord.getRadius() > inTree.getRadius()) {
                                polars.remove(polar);
                                polars.put(polar, coord);
                            }
                        }else {
                            polars.put(polar, coord);
                        }
                    }
                }
            }
            
            Coord[] points = (Coord[]) polars.values().toArray(new Coord[polars.size()]);
            
            // Too small
            if(polars.size() < 2) {
                
                sb.append((points.length + 1) + "\n" + p0);
                for(Coord co : points) {
                    sb.append(co);
                }
                
            // Loop time
            }else {
                
                Stack<Coord> stack = new Stack<Coord>();
                
                stack.push(p0);
                stack.push(points[0]);
                stack.push(points[1]);

                Coord pi = null;
                for(int i = 2; i < points.length; i++) {
                    
                    pi = points[i];
                    
                    int cross;
                    while (true) {
                        Coord top = stack.get(stack.size() - 1);
                        Coord next = stack.get(stack.size() - 2);
                        
                        int crossL = (top.getY() - next.getY()) * (pi.getX() - top.getX());
                        int crossR = (top.getX() - next.getX()) * (pi.getY() - top.getY());
                        cross = crossL - crossR;
                        
                        if (cross < 0) {
                            break;
                        }
                        stack.pop();
                    }
                    stack.push(pi);

                }
                
                // Popping the stack to get the coords
                sb.append(stack.size() + "\n");
                for(Coord coord : stack) {
                    sb.append(coord);
                }
            }
            
            num = Integer.parseInt(br.readLine());
        }
        // Output
        System.out.print(sb);
        
        br.close();
    }

}

class Coord {
    
    int x;
    int y;
    double polar;
    double radius;
    
    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    public double getPolar() {
        return polar;
    }

    public void setPolar(Coord coord) {
        
        double ys = y - coord.getY();
        double xs = x - coord.getX();

        if (xs == 0) {
            // Handle special case when xs is 0 to avoid division by zero
            polar = 0;
            if(ys > 0) {
                polar = 90;
            }else if(ys < 0) {
                polar = 270;
            }
            
        } else {
            polar = Math.toDegrees(Math.atan2(ys, xs));
            if(polar < 0) {
                polar += 360;
            }
        }

        radius = Math.sqrt(xs * xs + ys * ys);

        polar = round(polar, 7);
        radius = round(radius, 7);
    }
    
    // To round the decimals
    public double round(double num, int places) {
        
        double factor = Math.pow(10, places);
        double out = Math.round(num * factor) / factor;
        
        return out;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return x + " " +  y + "\n";
    }
    
}
