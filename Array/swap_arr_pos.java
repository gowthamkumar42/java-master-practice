import java.util.Scanner;
public class swap_arr_pos {
    public static void swap(int len,int arr[],int pos1,int pos2){
        if(pos1 >= 0 && pos2 >= 0 && pos1 < len && pos2 < len) {
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;
        } else {
            System.out.println("Invalid input");
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len=sc.nextInt();
        System.out.println("Enter array values: ");
        int []arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter position 1: ");
        int pos1=sc.nextInt();
        System.out.println("Enter position 2: ");
        int pos2=sc.nextInt();

        swap(len,arr,pos1,pos2);
    }
}
