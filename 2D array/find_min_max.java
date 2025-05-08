import java.util.Scanner;

public class find_min_max {
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
        int min=matrix[0][0];
        int max=matrix[0][0];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Minimum value is: "+min);
        System.out.println("Maximun value is: "+max);
    }
}
