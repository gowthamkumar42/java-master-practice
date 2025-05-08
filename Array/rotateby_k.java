import java.util.Scanner;
public class rotateby_k {
    public static void rotate(int k,int arr[]) {
        k=k%arr.length;
        int n=arr.length;
        int []temp=new int[k];

        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
        for(int term:arr){
            System.out.print(term+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int l=sc.nextInt();
        int[]arr=new int[l];
        System.out.println("Enter array values: ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter rotate times: ");
        int k= sc.nextInt();
        rotate(k,arr);
    }
}
