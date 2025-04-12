public class bubble {
    public static void sortarry(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
          for (int term : arr) {
            System.out.print(term + " ");
        }
    }
    public static void main(String[] args) {
        int[]arr={9,7,6,4,2,1};
        sortarry(arr);
    }
}
