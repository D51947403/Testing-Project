package singraul.basic.logic;

public class TwoDArray {

	public static void main(String[] args) {
		String [][] countryMatrix = {{"india" , "Pakistan","Nepal"}, 
				{"Bhutan", "Japan","Bangladesh"}, 
				{"Malesia","ShreeLanka","Maldiv"}
				};
		
	//	System.out.println(getReverseString("india"));
		print2DArray(countryMatrix);
	}
	
	public static void print2DArray(String [][] matrix) {
		
		for (int i=0; i< matrix.length ; i++) {
			for (int j=0; j< matrix[0].length ; j++) {
				System.out.print(matrix[i][j]= getReverseString(matrix[i][j])+"\t\t");
			}
			System.out.println();
		}
	}
	
	public static String  getReverseString(String str) {
		char[] charArr = str.toCharArray();
		String reverseString ="";
		for(int i =charArr.length-1; i>=0; i--) {
			reverseString=reverseString+charArr[i];
		}
		return reverseString;
	}
   
}
