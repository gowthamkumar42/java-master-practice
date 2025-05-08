import java.util.Scanner;

public class deletion_bigin_end {
    public static void deletion(int []arr) {
        int []temp=new int[arr.length-2];
        int k=1;
        for(int i=0;i< arr.length-2;i++){
            temp[i]=arr[i+1];
        }
        System.out.println("After deletion: ");
        for(int term:temp){
            System.out.print(+term+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = sc.nextInt();
        System.out.println("Enter array values: ");
        int[] arr = new int[len];
        for (int i =0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        deletion(arr);
    }
}
