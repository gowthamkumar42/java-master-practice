import java.util.Scanner;
public class sumof_minus_itself {
    public static void sumof(int len,int arr[]) {
        int sum=0;
        for(int i=0;i<len;i++){
            sum=sum+arr[i];
        }

        for(int i=0;i<len;i++){
            System.out.print((arr[i]=sum-arr[i])+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len=sc.nextInt();
        System.out.println("Enter array values: ");
        int[]arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        sumof(len,arr);
    }
}
