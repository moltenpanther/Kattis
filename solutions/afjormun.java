import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class afjormun {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        for(int h = 0; h < num; h++) {
        	
        	String line = br.readLine();
        	
        	char first = line.charAt(0);
        	if(first > 96) {
        		sb.append((char)(first - 32));
        	}else {
        		sb.append(first);
        	}

        	for(int i = 1; i < line.length() - 1; i++) {
	        	
	        	char ch = line.charAt(i);
	        	
	        	if(ch != ' ') {	        		
		        	if(ch > 96) {
		        		sb.append(ch);
		        	}else {
		        		sb.append((char)(ch + 32));
		        	}
	        	}else {
	        		sb.append(ch);
	        	}
	        }
        	
	        sb.append(".\n");
        }
        
        // Output
    	System.out.println(sb);
   		
    	br.close();
    }

}
