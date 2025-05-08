import java.util.Scanner;

public class odd_even_count {
    public static void oddevencount(int arr[]) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("odd count: " + odd);
        System.out.println("even count: " + even);
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
            oddevencount(arr);
    }
}
