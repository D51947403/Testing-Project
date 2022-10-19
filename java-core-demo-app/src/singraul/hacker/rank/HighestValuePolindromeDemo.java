package singraul.hacker.rank;

public class HighestValuePolindromeDemo {

	public static void main(String[] args) {
		System.out.println(highestValuePalindrome("43435", 5, 3));

	}
	// All test cases not passed 
	public static String highestValuePalindrome(String numStr, int n , int k) {

          char [] polinArr = numStr.toCharArray();
           int  minChange =0;
       
       for (int i=0,j=n-1; i<j ; i++ , j--) {
    	   if (polinArr[i] != polinArr[j])
    		   minChange++ ;
    	   
       }
       // if minimum change is greater than given limit for change then not possible
       if (minChange > k) return "-1";
       
       // count both changes 
       int bothChange = k-minChange ;
       
       int i=0 , j=n-1 ;
       
       for(; i <=j ; i++ ,j--) {
    	   
    	   char maxChar = (char)Math.max(polinArr[i], polinArr[j]);
    	   // if both character are not same 
    	   if (polinArr[i] != polinArr[j]) {
    		   // if bothChange is greater than or equal to 1 
    		   if(bothChange >=1 && maxChar !='9' ) {
    			   polinArr[i] = polinArr[j] ='9' ; bothChange --;
    		   }else {
    			   polinArr[i] = polinArr[j] =maxChar ; minChange--; 
    		   }
    	   }else {
    		   if(bothChange >=2 && maxChar !='9' ) {
    			   polinArr[i] = polinArr[j] ='9' ; bothChange -=2;
    		   }
    	   }
       }
		
       // replace middle element by 9 if string has odd length 
       if(bothChange !=0 && i-1 ==j+1)
    	   polinArr[i-1] ='9';
		
		return  new String (polinArr);
	}

}
