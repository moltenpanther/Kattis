    // Calculates Factorial
    public BigInteger getFact(int num) {
    	
    	BigInteger fact = BigInteger.ONE;
    	
    	for(int i = 1; i <= num; i++) {
    		fact = fact.multiply(BigInteger.valueOf(i));
    	}
    	
    	return fact;
    	
    }
