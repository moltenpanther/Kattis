import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vedurvindhradi {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    	
    	double wind = Double.parseDouble(br.readLine());
    	String level = "";
    	
    	if(wind <= .2) {
    		level = "Logn";
    	}else if(wind <= 1.5) {
    		level = "Andvari";
    	}else if(wind <= 3.3) {
    		level = "Kul";
    	}else if(wind <= 5.4) {
    		level = "Gola";
    	}else if(wind <= 7.9) {
    		level = "Stinningsgola";
    	}else if(wind <= 10.7) {
    		level = "Kaldi";
    	}else if(wind <= 13.8) {
    		level = "Stinningskaldi";
    	}else if(wind <= 17.1) {
    		level = "Allhvass vindur";
    	}else if(wind <= 20.7) {
    		level = "Hvassvidri";
    	}else if(wind <= 24.4) {
    		level = "Stormur";
    	}else if(wind <= 28.4) {
    		level = "Rok";
    	}else if(wind <= 32.6) {
    		level = "Ofsavedur";
    	}else {
    		level = "Farvidri";
    	}
    	
    	// Output
  		System.out.println(level);
    	
    	br.close();
    }

}
