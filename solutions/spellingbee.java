import java.util.Scanner;
public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        //Input and Setup
        String letters = scan.next();
        int num = scan.nextInt();
        String[] words = new String[num];
        
        for(int i = 0; i < num; i++) {
        	words[i] = scan.next();
        }
        
        //Count Valid Words
        int count = 0;
        for(int i = 0; i < num; i++) {    	
        	if(wordCheck(letters, words[i]).equals("t")) {
        		count++;        		
        	}
        }
        String[] ans = new String[count];
        
        //Add Valid Words to New Array
        int k = 0;
        for(int i = 0; i < num; i++) {    	
        	if(wordCheck(letters, words[i]).equals("t")) {
        		ans[k] = words[i];
        		k++;
        	}
        }
        
        //Print New Array
        for(int i = 0; i < ans.length; i++) {
        	System.out.println(ans[i]);
        }   
        scan.close();
    }
	
	public static String wordCheck(String letters, String word) {
		
        boolean match = true;
       	if(word.length() >= 4 && word.contains(String.valueOf(letters.charAt(0)))) {		
	       	for(int j = 0; j < word.length(); j++) {
	       		if(letters.contains(String.valueOf(word.charAt(j)))){
	       			match = true;
        		}else {	
        			match = false;
	        		j = word.length();
	        	}	
        	}
        }else {
        	match = false;
        }
       	
       	if(match) {
       		return("t");
       	}else {
       		return("f");
       	}
	}
}