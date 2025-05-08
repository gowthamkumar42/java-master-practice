import java.util.Scanner;
class second_largest {
    public static void slargest(int arr[]) {

        int largest = arr[0];
        int slargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }

     System.out.println("firstLargest value is: "+largest);
     System.out.println("Second largest value is: "+slargest);
}

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length: ");
            int len = sc.nextInt();
            System.out.println("Enter array values: ");
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            slargest(arr);
        }

 }

