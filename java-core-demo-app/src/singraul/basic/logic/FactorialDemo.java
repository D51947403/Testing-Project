package singraul.basic.logic;

public class FactorialDemo {

	public static void main (String args[]) {
		int x= 113;
		System.out.println(getFactorialRecursion(x));
		//System.out.println(getFactorial(6));
	}
	public static int getFactorialRecursion(int n) {
		if(n==0)
			return 1;
		else 
			return n*getFactorialRecursion(n-1);
	}
	
	public static int getFactorial (int n) {
		if(n==0)
			return 1;
		else {
			int fact=1;
			for (int i=n ; i>=1; i--) {
				fact = fact*i;
			}
			return fact;
		}
	}
}

