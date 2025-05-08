import java.util.Scanner;
public class left_diagonal_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row length: ");
        int r= sc.nextInt();
        System.out.println("Enter column length: ");
        int c= sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j==(r-i-1)){
                    System.out.println(arr[i][j]+" ");
                }
            }
        }
    }
}

