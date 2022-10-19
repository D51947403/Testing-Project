package singraul.hacker.rank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DivisibleSumPairs {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = divisibleSumPairs(n, k, ar);
		System.out.println("result " + result);
		bufferedReader.close();
	}

//	STDIN           Function
//	-----           --------
//	6 3             n = 6, k = 3
//	1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
	/*
	 * Complete the 'divisibleSumPairs' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER k 3. INTEGER_ARRAY ar
	 */

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		// Write your code here
		int pairCount = 0;
		int len = ar.size();
		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0)
					pairCount++;
			}

		}

		return pairCount;
	}
}
