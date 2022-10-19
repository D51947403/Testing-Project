package singraul.basic.logic;

public class ExceptionDemo {

	public static void main(String[] args) {

  //System.out.println(getNum());
System.out.print(getNumber());
	}
	
	public static int getNum() {
		try {
			return 10;
		}
		finally {
			return 20;
		}
	}

	public static int getNumber() {
		try {
			
			System.exit(0);
		}
		finally {
			return 20;
		}
	}
}
