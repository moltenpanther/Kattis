import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int times = scan.nextInt();
        int intervals = scan.nextInt();
        
        ArrayList<Integer> zac = new ArrayList<Integer>();
        ArrayList<Integer> music = new ArrayList<Integer>();
        
        for(int i = 0; i < times; i++) {
        	zac.add(scan.nextInt());
        }
        
        for(int i = 0; i < intervals; i++) {
        	music.add(scan.nextInt());
        }
        
        Collections.sort(zac);
        Collections.sort(music); 
        int count = 0;       
        while(zac.size() != 0 && music.size() != 0) {
        	
        	if(zac.get(zac.size() - 1) <= music.get(music.size() - 1)) {
        		zac.remove(zac.size() - 1);
        		music.remove(music.size() - 1);
        		count++;
        	}else {
        		zac.remove(zac.size() - 1);
        	}
        	
        }
        
        System.out.println(count);    
        
        scan.close();
        
	}

}
