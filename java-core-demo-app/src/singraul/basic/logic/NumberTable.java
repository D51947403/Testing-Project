package singraul.basic.logic;

public class NumberTable {
	public static void main(String args[]) {
		System.out.println("Number Table");
		System.out.println("=====================");
		for (int j = 1; j <= 10; j++) {
			for (int i = 11; i <= 20; i++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
}
