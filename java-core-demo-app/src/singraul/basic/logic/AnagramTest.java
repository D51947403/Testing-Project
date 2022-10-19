package singraul.basic.logic;
import org.junit.Test;
import static org.junit.Assert.*;
public class AnagramTest {
   
      
    @Test
    public void testIsAnagram() {
    	 
        assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
        assertTrue(AnagramCheck.isAnagram("mary", "army"));
        assertTrue(AnagramCheck.isAnagram("stop", "tops"));
        assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.isAnagram("pure", "in"));
        assertFalse(AnagramCheck.isAnagram("fill", "fil"));
        assertFalse(AnagramCheck.isAnagram("b", "bbb"));
        assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.isAnagram("a", "a"));
        assertFalse(AnagramCheck.isAnagram("sleep", "slep"));
       
    }
   
 
    
    @Test
    public void testFailedIfNotAnagram() {
    	 
        assertFalse(AnagramCheck.isAnagram("word", "work"));
        assertFalse(AnagramCheck.isAnagram("mary", "norms"));
        assertFalse(AnagramCheck.isAnagram("stop", "s"));
       
    }
}
