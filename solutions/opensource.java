import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class opensource {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // student, count
        Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
        LinkedList<Project> projects = new LinkedList<Project>();
        
        String title = "";
        HashSet<String> stuHash = new HashSet<String>();
        
        String line = "";
        while(!(line = br.readLine()).equals("0")) {
            
            if(!line.equals("1")) {
                
                // Project Title!
                if(line.charAt(0) > 64 && line.charAt(0) < 91) {
                    
                    if(title.length() > 0) {                        
                        Project proj = new Project(title, stuHash);
                        projects.add(proj);
                    }
                    
                    // Resets for a new project
                    title = line;
                    stuHash = new HashSet<String>();
                    
                }else {
                    // Student!
                    
                    if(hash.containsKey(line) && !stuHash.contains(line)) {
                        int count = hash.get(line);
                        hash.put(line, count + 1);
                    }
                    
                    hash.putIfAbsent(line, 1);
                    stuHash.add(line);
                }
                
            }else {
                // Case Over
                
                // Insert last project
                Project proj = new Project(title, stuHash);
                projects.add(proj);
                
                LinkedList<String> badStus = new LinkedList<String>();
                
                // Remove duplicate values
                for(Project project : projects) {
                    
                    stuHash = project.getStuHash();
                    for(String stu : stuHash) {
                        if(hash.get(stu) > 1) {
                            badStus.add(stu);
                        }
                    }
                    
                    for(String stu : badStus) {
                        stuHash.remove(stu);
                    }
                    
                    project.setStuHash(stuHash);
                }
                
                // Sort and Output
                projects.sort(Comparator.comparingInt(Project::getSize).reversed().thenComparing(Project::getTitle));
                
                // Output
                for(Project project : projects) {
                    System.out.println(project);
                }
                
                hash = new Hashtable<String, Integer>();
                projects = new LinkedList<Project>();
                
                title = "";
                stuHash = new HashSet<String>();
    
            }
            
        }
        
        br.close();
    }

}

class Project {

    String title;
    HashSet<String> stuHash;
    int size;
    
    public Project(String title, HashSet<String> stuHash) {
        this.title = title;
        this.stuHash = stuHash;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashSet<String> getStuHash() {
        return stuHash;
    }

    public void setStuHash(HashSet<String> stuHash) {
        this.stuHash = stuHash;
        this.size = stuHash.size();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        
        return title + " " + stuHash.size();
    }
    
}
