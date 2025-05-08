//Given a 2D matrix, change the entire row and column to 0 wherever
// a 0 is present in the original matrix. Return or print the modified matrix.
import java.util.*;
public class Set_Matrix_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int row=1;
        int col=1;
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
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                if(matrix[i][j]==0) {
                   row=i;
                   col=j;
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                if(i==row || j==col){
                    matrix[i][j]=0;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
