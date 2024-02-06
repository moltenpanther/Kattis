import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class classy {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int cases = Integer.parseInt(line[0]);
        
        // Start case loop
        StringBuilder ans = new StringBuilder();
        for(int h = 0; h < cases; h++) {
        
            line = br.readLine().split(" ");
            int num = Integer.parseInt(line[0]);
            Person[] arr = new Person[num];
            
            // Reading input
            int max = -1;
            for(int i = 0; i < num; i++) {
                
                line = br.readLine().split(" ");
                String name = line[0].substring(0, line[0].length() - 1);
                String[] classOrig = line[1].split("-");
                
                if(classOrig.length > max) {
                    max = classOrig.length;
                }
                
                arr[i] = new Person(name, classOrig);
            }
            
            // Lengthening the classes
            for(int i = 0; i < num; i++) {
                
                Person person = arr[i];
                String[] classOrig = person.getClassOrig();
                
                StringBuilder sb = new StringBuilder();
                
                int dif = max - classOrig.length;
                for(int j = classOrig.length - 1; j >= 0; j--) {
                    sb.append(classOrig[j].charAt(0));
                }
    
                for(int j = 0; j < dif; j++) {
                    sb.append("m");
                }
                
                String classShort = sb.toString();
                arr[i].setClassShort(classShort);
            }
            
            // Sorting the array
            Arrays.sort(arr, Comparator.comparing(Person::getClassShort).reversed().thenComparing(Person::getName));
    
            // Output
            for(int i = 0; i < num; i++) {
                String name = arr[i].name;
                ans.append(name + "\n");
            }
            
            ans.append("==============================\n");
            
        }
        
        System.out.print(ans);
        
        br.close();
    }

}

class Person {
    
    String name;
    String[] classOrig;
    String classShort;
    
    public Person(String name, String[] classOrig) {
        this.name = name;
        this.classOrig = classOrig;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String[] getClassOrig() {
        return classOrig;
    }
    
    public void setClassOrig(String[] classOrig) {
        this.classOrig = classOrig;
    }
    
    public String getClassShort() {
        return classShort;
    }
    
    public void setClassShort(String classShort) {
        this.classShort = classShort;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", classOrig=" + Arrays.toString(classOrig) + ", classShort=" + classShort
                + "]";
    }
    
}
