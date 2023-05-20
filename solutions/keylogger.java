import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        HashMap<String, Integer> sounds = new HashMap<String, Integer>();
        sounds = loadMap(sounds);
        
        int num = scan.nextInt();
        
        boolean caps = false;
        ArrayList<String> ans = new ArrayList<String>(num);
        
        for(int i = 0; i < num; i++) {
        	
        	String sound = scan.next();
        	int out = sounds.get(sound);
        	
        	if(out == 33 || out == 43 || out == 45) {
        		caps = !caps;
        	}else if(out == 127){
        		if(ans.size() > 0) {
        			ans.remove(ans.size() - 1);        			
        		}
        	}else {
        		
        		String ch = (char)out + "";
        		
	        	if(caps) {
	        		ans.add(ch.toUpperCase());
	        	}else {
	        		ans.add(ch.toLowerCase());
	        	}
        	}
        	
        }

        for(int i = 0; i < ans.size(); i++) {
        	System.out.print(ans.get(i));
        }
        
        
        scan.close();
		
	}	
	
public static HashMap<String, Integer> loadMap(HashMap<String, Integer> sounds){
        
        sounds.put("clank", 97);
        sounds.put("bong", 98);
        sounds.put("click", 99);
        sounds.put("tap", 100);
        sounds.put("poing", 101);
        sounds.put("clonk", 102);
        sounds.put("clack", 103);
        sounds.put("ping", 104);
        sounds.put("tip", 105);
        sounds.put("cloing", 106);
        sounds.put("tic", 107);
        sounds.put("cling", 108);
        sounds.put("bing", 109);
        sounds.put("pong", 110);
        sounds.put("clang", 111);
        sounds.put("pang", 112);
        sounds.put("clong", 113);
        sounds.put("tac", 114);
        sounds.put("boing", 115);
        sounds.put("boink", 116);
        sounds.put("cloink", 117);
        sounds.put("rattle", 118);
        sounds.put("clock", 119);
        sounds.put("toc", 120);
        sounds.put("clink", 121);
        sounds.put("tuc", 122);
        
        sounds.put("whack", 32);
        sounds.put("bump", 33); // CAPS
        sounds.put("pop", 127); // DEL
        sounds.put("dink", 43); // ON
        sounds.put("thumb", 45); // OFF
        
        return sounds;
        
//        sounds.put("clank","a");
//        sounds.put("bong","b");
//        sounds.put("click","c");
//        sounds.put("tap","d");
//        sounds.put("poing","e");
//        sounds.put("clonk","f");
//        sounds.put("clack","g");
//        sounds.put("ping","h");
//        sounds.put("tip","i");
//        sounds.put("cloing","j");
//        sounds.put("tic","k");
//        sounds.put("cling","l");
//        sounds.put("bing","m");
//        sounds.put("pong","n");
//        sounds.put("clang","o");
//        sounds.put("pang","p");
//        sounds.put("clong","q");
//        sounds.put("tac","r");
//        sounds.put("boing","s");
//        sounds.put("boink","t");
//        sounds.put("cloink","u");
//        sounds.put("rattle","v");
//        sounds.put("clock","w");
//        sounds.put("toc","x");
//        sounds.put("clink","y");
//        sounds.put("tuc","z");
//        
//        sounds.put("whack"," ");
//        sounds.put("bump","CAPS"); // CAPS
//        sounds.put("pop","DEL"); // DEL
//        sounds.put("dink","ON"); // ON
//        sounds.put("thumb","OFF"); // OFF
        
    }
}
