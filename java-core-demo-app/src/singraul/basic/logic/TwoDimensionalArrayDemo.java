package singraul.basic.logic;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {

		int [][] matrix=createMatrix();
		traverseMatrix(matrix);
	}

	private static void traverseMatrix(int [][] matrix) {
		for ( int r=0; r< matrix.length ;r++) {
			for(int c=0 ; c < matrix[0].length ;c++) {
				System.out.print(matrix[r][c]+" ");
			}
			System.out.println();
		}
		
	}

	private static int[][] createMatrix() {
		 int [][] board=new int [4][4];
			
		 int rows = board.length;
		 int columns = board[0].length;
		    System.out.println(" Row Size "+rows);
		    System.out.println("Column Size "+columns);
		    System.out.println();

		for (int r=0; r< rows ; r++ ) {
			 
			 for (int c=0; c< columns ; c++) {
				board[r][c]= r+c;
			 }
		}
		return board;
	}

}
