import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class maeting {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        HashMap<String, Student> hash = new HashMap<String, Student>();
        
        // Reading in names
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            String name = br.readLine();
            hash.put(name, new Student(name));
        }
        
        // Reading in attendance
        num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            
            String[] list = br.readLine().split(" ");
            for(int j = 1; j < list.length; j++) {
                String name = list[j];
                hash.get(name).addAttended();
            }
            
        }
        
        Comparator<Student> comp = Comparator.comparing(Student::getAttended).reversed();
        PriorityQueue<Student> queue = new PriorityQueue<Student>(comp);
        queue.addAll(hash.values());
        
        // Output
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());           
        }
        
        br.close();
    }

}

class Student implements Comparable<Student>{
    
    String name;
    int attended = 0;
    
    public Student(String name) {
        this.name = name;
        this.attended = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttended() {
        return attended;
    }

    public void setAttended(int attended) {
        this.attended = attended;
    }
    
    public void addAttended() {
        this.attended++;
    }
    
    @Override
    public String toString() {
        return attended + " " + name;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.attended, o.attended);
    }

}
