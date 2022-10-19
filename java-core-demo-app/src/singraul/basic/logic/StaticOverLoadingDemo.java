package singraul.basic.logic;

public class StaticOverLoadingDemo {

	public static void main(String[] args) {
		
      System.out.println(StaticOverLoadingDemo.add(10, 20));
      System.out.println(StaticOverLoadingDemo.add(10, 20, 30));
	}

	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}

}
