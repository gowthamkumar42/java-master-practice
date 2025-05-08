import java.util.Scanner;

public class reverse {
    public static void rev(int[] arr) {
        int pos1 = 0;
        int pos2 = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (pos1 < pos2) {
                int temp = arr[pos1];
                arr[pos1] = arr[pos2];
                arr[pos2] = temp;
                pos1++;
                pos2--;
            }
        }
        for (int term : arr) {
            System.out.print(term + " ");
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
        rev(arr);
    }
}
