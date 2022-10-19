package singraul.java8feature;

import java.util.stream.Stream;

public class StreamExampl1 {
// https://howtodoinjava.com/java8/java-streams-by-examples/
public static void main (String args[]) {
	System.out.println("Hello Stream Example");
	
	Stream<Integer> intStream = Stream.of(2,3,4,5,7,2,9,0,5,6);
	
	intStream.forEach(e -> System.out.print(e));
}

}
