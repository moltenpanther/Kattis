import java.util.ArrayList;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int end = scan.nextInt();
        int num = scan.nextInt();
        
        int[] errors = new int[num + 1];
        
        for(int i = 0; i < num; i++) {
        	errors[i] = scan.nextInt();      	
        }
        
        ArrayList<Integer> corrects = new ArrayList<Integer>();
        
        int errIndex = 0;
        for(int i = 1; i <= end; i++) {
        	if(i != errors[errIndex]) {
        		corrects.add(i);
        	}else {
        		errIndex++;
        	}
        }
        
        corrects.add(0);
        
        String err = "Errors: ";
        String corr = "Correct: ";
        
        for(int i = 0; i < errors.length - 1; i++) {
        	
        	err += errors[i];
        	if(errors[i] + 1 == errors[i + 1]) {   
	        	while(errors[i] + 1 == errors[i + 1] && errors[i] != errors[errors.length - 1]) {
	        		i++;
	        	}
	        	err += "-" + errors[i] + ", ";
        	}else {
        		err += ", ";
        	}
        }
        
        
        for(int i = 0; i < corrects.size() - 1; i++) {
        	
        	corr += corrects.get(i);
        	if(corrects.get(i) + 1 == corrects.get(i + 1)) {   
	        	while(corrects.get(i) + 1 == corrects.get(i + 1) && corrects.get(i) != corrects.get(corrects.size() - 1)) {
	        		i++;
	        	}
	        	corr += "-" + corrects.get(i) + ", ";
        	}else {
        		corr += ", ";
        	}
        }
        
        err = err.substring(0, err.lastIndexOf(","));
        err = err.substring(0, err.lastIndexOf(",")) + " and" + err.substring(err.lastIndexOf(" "));
        corr = corr.substring(0, corr.lastIndexOf(","));
        corr = corr.substring(0, corr.lastIndexOf(",")) + " and" + corr.substring(corr.lastIndexOf(" "));
  
        System.out.println(err);
        System.out.println(corr);
        
        scan.close();
    }    
	
}
