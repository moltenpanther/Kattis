import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class dodecaphony {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Hashtable<String, Integer> notes = getNotes();
        
        int num = Integer.parseInt(br.readLine());
        String[] song = br.readLine().split(" ");
        String[] newSong = br.readLine().split(" ");
        
        boolean transposed = checkTransposition(song, newSong, notes);
        
        if(!transposed) {
            
            boolean retro = checkRetrograde(song, newSong);
            if(!retro) {
                
                boolean inverted = checkInversion(song, newSong, notes);
                if(!inverted) {
                    System.out.println("Nonsense");
                }else {
                    System.out.println("Inversion");
                }
                
            }else {
                System.out.println("Retrograde");
            }
        }else {
            System.out.println("Transposition");
        }
        
        br.close();
    }


    private static boolean checkTransposition(String[] song, String[] newSong, Hashtable<String, Integer> notes) {
        
        for(int i = 0; i < song.length - 1; i++) {
            
            int dif1 = notes.get(song[i + 1]) - notes.get(song[i]);
            int dif2 = notes.get(newSong[i + 1]) - notes.get(newSong[i]);
            
            if(dif1 != dif2) {
                return false;
            }
        }
        
        return true;
    }

    private static boolean checkRetrograde(String[] song, String[] newSong) {
        
        for(int i = 0; i < song.length; i++) {
            //System.out.println(song[i] + " ~~ " + newSong[song.length - i]);
            if(!song[i].equals(newSong[(song.length - 1) - i])) {
                return false;
            }
        }
        
        return true;
    }

    private static boolean checkInversion(String[] song, String[] newSong, Hashtable<String, Integer> notes) {
        
        if(!song[0].equals(newSong[0])) {
            return false;
        }
        
        for(int i = 1; i < song.length; i++) {
            
            int dif1 = notes.get(song[i]) - notes.get(song[0]);
            int dif2 = (notes.get(newSong[i]) - notes.get(newSong[0])) * -1;
            
            if(dif1 < 0) {
                dif1 = 12 + dif1;
            }
            if(dif2 < 0) {
                dif2 = 12 + dif2;
            }
            
            if(dif1 != dif2) {
                return false;
            }
        }
        
        return true;
    }

    private static Hashtable<String, Integer> getNotes() {
        
        Hashtable<String, Integer> notes = new Hashtable<String, Integer>();        
        
        notes.put("C", 0);
        notes.put("C#", 1);
        notes.put("D", 2);
        notes.put("D#", 3);
        notes.put("E", 4);
        notes.put("F", 5);
        notes.put("F#", 6);
        notes.put("G", 7);
        notes.put("G#", 8);
        notes.put("A", 9);
        notes.put("A#", 10);
        notes.put("B", 11);
        
        return notes;
        
    }

}
