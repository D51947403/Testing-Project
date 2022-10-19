package singraul.hacker.rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class CountStringDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter string ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(isr);
		
		String  str= bufferedReader.readLine().trim();
		
		CountStringDemo.countStringDemo(str);
	}

	private static void countStringDemo(String str) {
		 
		int countInt=0; 
		int countStr=0;
		int countDouble=0;
		
		String [] strArr= str.split(" ");
		
		for (String word : strArr) {
		
		if (Pattern.matches("\\d+", word))
		  countInt++;
		 else if (Pattern.matches( "\\d+\\.\\d+", word)) 
			 countDouble++;
		 else 
			 countStr++;
		
		}
		System.out.println("string "+countStr);
		System.out.println("integer "+countInt);
		System.out.println("countDouble "+countDouble);
	}

}
