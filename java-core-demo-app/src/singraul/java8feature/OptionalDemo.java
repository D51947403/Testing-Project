package singraul.java8feature;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String extractType =null;
		//String extractType="kumar";
	     Optional<String> optExtractType = Optional.ofNullable(extractType);
	     System.out.println(optExtractType.isPresent());
	     System.out.println(optExtractType);
	     System.out.println(optExtractType.orElse("Devendra"));


	}

}
