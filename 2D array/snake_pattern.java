import java.util.*;
public class snake_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[][] matrix = new int[l][l];
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
        for (int i = 0; i < matrix.length; i++) {
           if(i%2==0){
               for(int j=0;j< matrix[i].length;j++){
                   System.out.print(matrix[i][j]+" ");
               }
               System.out.println();
           }
           else{
               for(int k= matrix.length-1;k>=0;k--){
                   System.out.print(matrix[i][k]+" ");
               }
               System.out.println();
           }

        }
    }
}
