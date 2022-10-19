package singraul.basic.logic;

public class PrimeNumberDemo {

	public static void main (String[] args) {
		for (int i=1 ; i<100 ;i++) {
			  if( isPrimeNumber(i))
			System.out.println(i+" is prime number.");
		}
	}
	
	public static boolean isPrimeNumber(int n) {
		 int m= n/2 ;
		 
		 if (n <= 1)
			 return false;
		 
		 for (int i=2 ; i <=m ; i++) {
			 if(n%i == 0)
				 return false;
		 }
		
		return true;
	}
	
}

