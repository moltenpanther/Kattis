import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class congaline{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //  BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\molte\\eclipse-workspace\\Kattis\\bin\\input.txt"));
        
        Hashtable<String, Person> hash = new Hashtable<String, Person>();
                
        String[] line = br.readLine().split(" ");
        int num = Integer.parseInt(line[0]);
        
        // Filling the conga line
        String head = "";
        String tail = "";
        String prev = "";
        for(int i = 0; i < num; i++) {
            
            line = br.readLine().split(" ");
            String name1 = line[0];
            String name2 = line[1];
            
            // name, partnerName, Person partner, Person before, Person after)
            Person person1 = new Person(name1, name2, null, null, null);
            Person person2 = new Person(name2, name1, person1, person1, null);
            
            person1.setPartner(person2);
            person1.setAfter(person2);          
            
            // Handling the gaps between couples
            if(i == 0) {
                head = person1.name;
            }else {
                Person before = hash.get(prev);
                person1.setBefore(before);
                before.setAfter(person1);
                
                hash.replace(prev, before);             
            }
            
            if(i == num - 1){
                tail = person2.name;
            }   
            
            prev = name2;
            
            hash.put(name1, person1);
            hash.put(name2, person2);
        }
        
        ////////////////////////////////////////
        ////////////////////////////////////////
        
        StringBuilder sb = new StringBuilder();
        Person mic = hash.get(head);
        Person first = hash.get(head);
        Person last = hash.get(tail);
        
        // Instructions
        // F B R C P
        String instructions = br.readLine();
        for(int i = 0; i < instructions.length(); i++) {
            
            char instr = instructions.charAt(i);
            
            if(instr == 'F') {
                mic = mic.before;               
            }else if(instr == 'B') {
                mic = mic.after;
            }else if(instr == 'R') {
                
                if(mic == last) {
                    mic = first;
                }else {
                    if(mic == first) {
                        mic.after.setBefore(null);
                        first = mic.after;
                    }else {
                        mic.before.setAfter(mic.after);                     
                        mic.after.setBefore(mic.before);
                    }

                    Person temp = mic.after;
                    
                    last.setAfter(mic);
                    mic.setBefore(last);
                    mic.setAfter(null);
                                        
                    last = mic;
                    mic = temp;
                }   
                
            }else if(instr == 'C') {
                
                Person partner = hash.get(mic.partnerName);

                if(mic == last) {
                    if(mic.before != mic.partner) {                         
                        
                        mic.before.setAfter(null);
                        last = mic.before;
                    
                        mic.setAfter(partner.after);
                        mic.setBefore(partner);

                        if(partner != last) {
                            partner.after.setBefore(mic);
                            partner.setAfter(mic);
                        }else {
                            partner.setAfter(mic);
                            last = mic;
                        }
                    }
                    
                    mic = first;
                    
                }else {                 
                    if(mic == first) {
                        mic.after.setBefore(null);
                        first = mic.after;
                    }else {         
                        mic.before.setAfter(mic.after);                     
                        mic.after.setBefore(mic.before);
                    }
                    
                    // Now mic goes behind partner
                    Person temp = mic.after;
                    
                    mic.setAfter(partner.after);
                    mic.setBefore(partner);
                    if(partner != last) {
                        partner.after.setBefore(mic);                       
                        partner.setAfter(mic);   
                    }else {
                        partner.setAfter(mic);   
                        last = mic;
                    }
                    
                    mic = temp;
                }

            }else if(instr == 'P') {
                //sb.append("~" + mic.name + "\n");
                sb.append(mic.partnerName + "\n");
            }
        }
        
        // Test print
        sb.append("\n");
        Person person = first;
        sb.append(person.name + "\n");
        
        while(person.after != null) {
            person = person.after;
            sb.append(person.name + "\n");
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }

}

class Person{
    
    String name;
    String partnerName;
    Person partner;
    Person before;
    Person after;
    
    public Person(String name, String partnerName, Person partner, Person before, Person after) {
        this.name = name;
        this.partnerName = partnerName;
        this.partner = partner;
        this.before = before;
        this.after = after;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPartnerName() {
        return partnerName;
    }
    
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
    
    public Person getPartner() {
        return partner;
    }
    
    public void setPartner(Person partner) {
        this.partner = partner;
    }
    
    public Person getBefore() {
        return before;
    }
    
    public void setBefore(Person before) {
        this.before = before;
    }
    
    public Person getAfter() {
        return after;
    }
    
    public void setAfter(Person after) {
        this.after = after;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", partnerName=" + partnerName + ", partner=" + partner + ", before=" + before
                + ", after=" + after + "]";
    }
    
}
