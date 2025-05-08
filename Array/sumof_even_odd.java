import java.util.Scanner;
public class sumof_even_odd {
    public static void sumofeven(int[] arr) {
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                even+=arr[i];
            }else{
                odd+=arr[i];
            }
        }
        System.out.println("sum of even: "+even);
        System.out.println("sum of odd: "+odd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int l=sc.nextInt();
        System.out.println("Enter array values: ");
        int []arr=new int[l];
        for(int i=0;i< arr.length;i++){
            arr [i]=sc.nextInt();
        }
        sumofeven(arr);
    }
}
