import java.util.Scanner;
public class sum_of_right_side {
    public static void rightsideele(int len,int arr[]){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }

        for(int i=0;i< arr.length;i++){
            int temp=arr[i];
            arr[i]=sum-arr[i];
            sum-=temp;
        }
        System.out.println("After adding right side element: ");
        for(int term:arr){
            System.out.print(term+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len=sc.nextInt();
        int []arr=new int[len];
        System.out.println("Enter array values: ");
        for(int i=0;i<len;i++){
            arr[i]= sc.nextInt();
        }
        rightsideele(len,arr);
    }
}
