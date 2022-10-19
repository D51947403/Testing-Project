package singraul.hacker.rank;
/**
 * https://www.hackerrank.com/challenges/richie-rich
 */
public class HigestValuePolindrome {

	public static void main(String[] args) {
		System.out.println(highestValuePalindrome("43435", 5, 3));
	}
// All test cases passed 
	public static String highestValuePalindrome(String numStr, int n, int k) {
		char[] chars = numStr.toCharArray();
		int minChange = 0;
		 // check element from left and right and if there is difference
		// then increase minChange count by 1 each time
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			if (chars[i] != chars[j]) {
				minChange++;
			}
		}
		// if minChange is greater than given replacement limit value (k) then not possible
		if (minChange > k) {
			return "-1";
		}
		// check how many time we can change both value 
		int changeBoth = k - minChange; //3-1 = 2
		int i = 0;
		int j = n - 1;
		for (; i <= j; i++, j--) {
			if (chars[i] != chars[j]) {
				char maxChar = (char) Math.max(chars[i], chars[j]);
				if (maxChar != '9' && changeBoth - 1 >= 0) {
					chars[i] = '9';
					chars[j] = '9';
					changeBoth--;
				} else {
					chars[i] = maxChar;
					chars[j] = maxChar;
					minChange--;
				}
			} else {
				char maxChar = (char) Math.max(chars[i], chars[j]);
				if (maxChar != '9' && changeBoth - 2 >= 0) {
					chars[i] = '9';
					chars[j] = '9';
					changeBoth -= 2;
				}
			}
		}
		// replace middle element by 9 
		if (changeBoth != 0 && i - 1 == j + 1) {
			chars[i - 1] = '9';
		}
		String palindrome = new String(chars);
		return palindrome;
	}
}
