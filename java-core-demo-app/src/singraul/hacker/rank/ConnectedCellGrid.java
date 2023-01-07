package singraul.hacker.rank;
import java.util.Scanner;
/**
 * https://www.thepoorcoder.com/hackerrank-connected-cells-in-a-grid-solution/
 * @author 2106725
 *
 */
public class ConnectedCellGrid {
    static int helper(int[][] matrix , int i , int j){
        if(i<0 || j<0 || i >= matrix.length || j >= matrix[i].length)
            return 0;
        if(matrix[i][j] == 0)
            return 0;
        int size = 1;
        matrix[i][j] = 0;
        for(int r = i-1; r<=i+1;r++){
            for(int c = j-1; c <= j+1; c++){
                if(r != i || c != j){
                    size += helper(matrix,r,c);
                }
            }
        }
        return size;
    }

    static int connectedCell(int[][] matrix,int n , int m ) {
        int max = 0;
        for(int i  = 0 ;i<n;i++){
            for(int j = 0 ;j<m;j++){
                if(matrix[i][j] == 1){
                    int size = helper(matrix , i ,j);
                    max = Math.max(size , max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for(int matrix_i = 0; matrix_i < n; matrix_i++){
            for(int matrix_j = 0; matrix_j < m; matrix_j++){
                matrix[matrix_i][matrix_j] = in.nextInt();
            }
        }
        int result = connectedCell(matrix,n,m);
        System.out.println(result);
        in.close();
    }
}