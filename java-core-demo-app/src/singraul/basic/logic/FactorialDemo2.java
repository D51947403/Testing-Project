package singraul.basic.logic;

import java.math.BigInteger;

public class FactorialDemo2 {
	  public static void main(String[] args) {
	       String str= "India";
	      for(char c : str.toCharArray()){
	          System.out.println((int)c);
	          System.out.println( "factorial " +getFactorial((int)c));
	      }
	    }
	  
	private	static BigInteger  getFactorial (int n) {

			if(n==0)
				return BigInteger.valueOf(1);
			else {
				BigInteger  fact=BigInteger.valueOf(1);
				for (int i=n ; i>=1; i--) {
					fact = fact.multiply(BigInteger.valueOf(i));
				}
				return fact;
			}
		}
}
