import java.util.Scanner;
public class remove_element_array {
    public static void remove(int[] arr,int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        if(count==0){
            System.out.println("Element not found !");
        }
        int[]newarrray=new int[arr.length-1];
        int idx=0;
        for(int i=0;i<newarrray.length;i++){
            if(arr[i]!=k){
                newarrray[idx++]=arr[i];
            }
        }
        System.out.println("After removing "+k);
        for(int term:newarrray){
            System.out.print(term+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = sc.nextInt();
        System.out.println("Enter array values: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter remove element: ");
        int k= sc.nextInt();
        remove(arr,k);
    }
}
