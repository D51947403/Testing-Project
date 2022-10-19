package singraul.hacker.rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		System.out.println("Enter any integer number ");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		    int n = Integer.parseInt(bufferedReader.readLine().trim());
		    
		    FizzBuzzDemo.fizzBuzz(n);
		    bufferedReader.close();

	}
	
	public static void fizzBuzz(int n) {
		for (int i=1; i<=n ; i++) {
			if( i%3==0 && i%5==0)
			   System.out.println("FizzBuzz");
			else if  (i%3==0 && i%5!=0)
               System.out.println("Fizz");
			else if  (i%3 !=0 && i%5==0)
	           System.out.println("Buzz");
			else 
	           System.out.println(i);
		}
	}

}
