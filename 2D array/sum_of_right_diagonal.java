import java.util.Scanner;

public class sum_of_right_diagonal  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row length: ");
        int r= sc.nextInt();
        System.out.println("Enter column length: ");
        int c= sc.nextInt();
        int sum=0;
        int[][] arr=new int[r][c];
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
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i]==arr[j])
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of right diagonal: ");
        System.out.println(sum);
    }
}

