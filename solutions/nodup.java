import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String input = " " + scan.nextLine() + " ";
        int length = input.length();
        int count = 0;
        
        for(int i = 1; i < length; i++) {
        	if(input.charAt(i) == ' ') {
        		count++;
        	}
        }
        
        String[] words = new String[count];
        String sub = "";
        int first = 0;
        int last = 0;
        int j = 0;
        boolean match = false;
        
        for(int i = 1; i < length; i++) {
        	
        	if(input.charAt(i) == ' ') {
        		last = i;
        		sub = input.substring(first + 1, last);
        		words[j] = sub;
        		j++;
        		first = i;
        	}
        }
        
        for(int i = 0; i < words.length; i++) {
        	
        	for(int k = i + 1; k < words.length; k++) {
        		if(words[i].equals(words[k])) {
            		match = true;
            		k = words.length;
            		i = words.length;
            	}	
        	}
        }
        
        if(match) {
        	System.out.println("no");
        }else {
        	System.out.println("yes");
        }
        
        scan.close();
    }

}