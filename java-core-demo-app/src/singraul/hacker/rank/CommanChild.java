package singraul.hacker.rank;

import java.util.Scanner;

public class CommanChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        String b = sc.next();
	        
	        System.out.println(commonChild(a,b));
	        System.out.println(LCS(a, b));
	}
// https://programs.programmingoneonone.com/2021/03/hackerRank-common-child-solution.html
	// All test cases passed 
	 public static int commonChild(String str1, String str2) {
		    // Write your code here
	    	 int l1 = str1.length();
	        int l2 = str2.length();
	 
	        int[][] arr = new int[l1 + 1][l2 + 1];
	 
	        for (int i = l1 - 1; i >= 0; i--)
	        {
	            for (int j = l2 - 1; j >= 0; j--)
	            {
	                if (str1.charAt(i) == str2.charAt(j))
	                    arr[i][j] = arr[i + 1][j + 1] + 1;
	                else 
	                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
	            }
	        }
	 
	        int i = 0, j = 0;
	        StringBuffer sb = new StringBuffer();
	        while (i < l1 && j < l2) 
	        {
	            if (str1.charAt(i) == str2.charAt(j)) 
	            {
	                sb.append(str1.charAt(i));
	                i++;
	                j++;
	            }
	            else if (arr[i + 1][j] >= arr[i][j + 1]) 
	                i++;
	            else
	                j++;
	        }
	        return sb.toString().length();
	    }
		// Longest Common Substring 
	 // Time Complexity O(m*n)
	 // Space Complexity O(m*n)
	 public static int LCS(String X, String Y) {
		 int m = X.length() ; int n= Y.length();
		 char[]x =X.toCharArray(); 
		 char[]y =Y.toCharArray(); 
		 int memo[][] = new int [m+1][n+1];
		 for(int i=0; i<= m ; i++) {
			 for (int j=0; j <= n; j++) {
				   if(i==0 || j==0)
					 memo[i][j]=0;
				 else if(x[i-1] == y[j-1])
					 memo[i][j] = memo[i-1][j-1]+1;
				 else  
					 memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
			 } 
		 }

		 return memo[m][n];
	 }
}
