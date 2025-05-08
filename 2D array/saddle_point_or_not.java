import java.util.Scanner;
public class saddle_point_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            int rowmin= matrix[i][0];
            for (int j = 0; j <matrix.length; j++) {
                if (matrix[i][j]<rowmin) {
                    rowmin = matrix[i][j];
                    row = j;
                }
            }
        }
        int colmax = matrix[0][row];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][row] > colmax) {
                colmax = matrix[i][row];
            }
        }

    }
}
