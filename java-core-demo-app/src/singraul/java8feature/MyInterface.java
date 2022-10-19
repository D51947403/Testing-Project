package singraul.java8feature;

public interface MyInterface {
	// normal method
	int getNumbr ();
	// default method 
	default String getString() {
		return "India";
	}
	// static method
	static int getDefaultNumber() {
		return -1;
	}
	
	public static void main (String args[]) {
		System.out.println("=== main method inside interface ====");
		
		System.out.println(MyInterface.getDefaultNumber());
	
	}
	
	

}
