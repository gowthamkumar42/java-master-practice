//Find the row with the minimum element, then from that row,
// find the maximum element. Print or return that maximum value.
import java.util.Scanner;
public class row_min_col_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i< matrix.length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       int colindex=0;
        for(int i=0;i<matrix.length;i++){
            int rowmin=matrix[i][0];
            for(int j=0;j< matrix.length;j++){
                if(matrix[i][j]<rowmin){
                    rowmin=matrix[i][j];
                     colindex=j;
                }
              }
           }
        int colmax=matrix[0][colindex];
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][colindex]>colmax){
                colmax=matrix[i][colindex];
            }
        }
        System.out.println(colmax);
    }
}
