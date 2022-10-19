package singraul.basic.logic;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		System.out.println(	isAnagram("mary", "army"));
	

	}
	public static boolean isAnagram(String word, String anagram){
		if ( word.length() != anagram.length()) {
			return false;
		}
		
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();       
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
       
        return Arrays.equals(charFromWord, charFromAnagram);
    }

}
