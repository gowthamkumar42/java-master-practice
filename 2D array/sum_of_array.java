import java.util.Scanner;
public class sum_of_array {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter row length: ");
          int r= sc.nextInt();
        System.out.println("Enter column length: ");
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter array  elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        for(int i=0;i< r;i++){
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum of 2D array");
        System.out.println(sum);
    }
}
