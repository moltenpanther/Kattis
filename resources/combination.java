    // Calculate Combination
    public BigInteger getCombination(int n, int r){
    	
    	BigInteger combo = BigInteger.ONE;
    	
    	BigInteger top = getFact(n);
    	BigInteger bottom = getFact(n - r).multiply(getFact(r));
    	
    	combo = top.divide(bottom);
    	
    	return combo;
    }
    
    // Calculates Factorial
    public BigInteger getFact(int num) {
    	
    	BigInteger fact = BigInteger.ONE;
    	
    	for(int i = 1; i <= num; i++) {
    		fact = fact.multiply(BigInteger.valueOf(i));
    	}
    	
    	return fact;
    	
    }
