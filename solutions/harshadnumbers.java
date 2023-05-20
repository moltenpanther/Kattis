import java.util.Scanner;

public class Kattis{

    public static void main(String[] args){
        
    	Scanner scanner = new Scanner(System.in);
    	
    	String sNum = scanner.next();
    	int count = 0;
    	int count2 = 0;
    	int num = Integer.valueOf(sNum);
    	int sum = 0;
    	char bit = 'a';
    	int digit = 0;
    		
    		while(count != 42) {
	    		//Calculate if harshad
			    	while(count2 != sNum.length()) {
			    		bit = sNum.charAt(count2);
			    		digit = Character.getNumericValue(bit);
			    		sum += digit;
			    		count2 += 1;
			    	}	
			//State if harshad
			    if(num % sum == 0) {
			    	count = 42;
			    	System.out.println(num);
			    }else {
			    	num += 1;
			    	sNum = String.valueOf(num);
			    	sum *= 0;
			    	count2 *= 0;
			    }
    		}
    	
    	scanner.close();
    }		

}


/*while(harshad = false) {
//Harshad check
while(count != sNum.length()) {
	bit = sNum.charAt(count);
	digit = Character.getNumericValue(bit);
	sum += digit;
	count += 1;
	
	System.out.println("Length: " + sNum.length());
	System.out.println("Bit: " + bit);
	System.out.println("Digit: " + digit);
	System.out.println("Harshad? " + num / sum);
		if(num / sum % 2 == 0) {
		harshad = true;
		}
	}


harshadCheck = num / sum;

while(harshad = true) {
	System.out.println(num);
	System.out.println(sum);
	System.out.println(harshadCheck);
	*/