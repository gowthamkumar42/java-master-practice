import java.util.Scanner;

public class first_non_duplicate {

    public static int nonduplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = sc.nextInt();

        System.out.println("Enter array values: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int result = nonduplicate(arr);
        if (result != -1) {
            System.out.println("First non-duplicate element: " + result);
        } else {
            System.out.println("No non-duplicate element found.");
        }
    }
}
