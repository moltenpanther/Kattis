import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stafur {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	char letter = (char) br.read();
    	
    	if(letter == 'Y') {
    		System.out.println("Kannski");
    	}else if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
    		System.out.println("Jebb");
    	}else {
    		System.out.println("Neibb");
    	}

    	br.close();
    }

}
