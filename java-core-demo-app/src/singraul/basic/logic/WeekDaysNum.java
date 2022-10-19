package singraul.basic.logic;

public class WeekDaysNum {

	public static void main(String[] args) {
		 String sample_array[]
		           = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		 
		int outArray [] = new int [7];
		 int i=0;
		 for (String weekday :sample_array) {
			 int sum=0;
			 char[] weekdayChar = weekday.toCharArray() ;
			for(char  c : weekdayChar) {
				sum+=c;
			}
			outArray[i++] = sum;
		 }

        for (int k : outArray) {
        	System.out.print(k+"\t");
        }
	}

}
