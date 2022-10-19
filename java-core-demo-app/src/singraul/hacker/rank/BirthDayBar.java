package singraul.hacker.rank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class BirthDayBar {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	//	System.out.println("Enter number of square on chocobar ");
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		//System.out.println("Enter "+n+" values on chocobar separated by space");
		List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		int result = Result1.birthday(s, d, m);
		
		int response = Solution.birthdayBar(s, d, m);

		System.out.println(result+" "+response);
		
		bufferedReader.close();
	}

}
// input pattern 
//5
//2 2 3 1 4
//4 2

class Solution {
	
	public static int birthdayBar(List<Integer> s, int d, int m) {
		int waysCount=0;
		int len= s.size();
		
		for (int i=0; i< len; i++) {
			int sum=0; 
			
			if ((i+m)>len)
				return waysCount;
			
			for (int j=0; j<m ; j++) {
				sum= sum +s.get(i+j);
			}
			
			if(d==sum)
				waysCount ++;
			
		}
		
		return waysCount;
	}
}


class Result1 {

	/*
	 * Complete the 'birthday' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY s
	 *  2. INTEGER d ==> Sum
	 *   3. INTEGER m ==> length
	 */

	public static int birthday(List<Integer> s, int d, int m) {

		int waysCount = 0; // for storing the total no of ways
		int len = s.size();
		for (int i = 0; i < len; i++) {
			int sum = 0; // for storing the sum of the m digits
			/*
			 * if sum of current position and m is greater than size of s then there will be
			 * overflow so need to check just return the waysCount
			 */
			if ((i + m) > len) {
				return waysCount;
			}
			for (int j = 0; j < m; j++) {
				sum = sum + s.get(i + j);
			}
			if (sum == d) {
				waysCount++;
			}

		}

		return waysCount;

	}


}
