//Find the row with the maximum sum
import java.util.*;
public class row_maximum_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row length: ");
        int r=sc.nextInt();
        System.out.println("Enter column length: ");
        int c= sc.nextInt();
        int[][]arr=new int[r][c];
        System.out.println("Enter values: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int row=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                row=i;
            }
        }
        System.out.println("row: "+row);
        System.out.println("maximun sum: "+max);
    }
}
