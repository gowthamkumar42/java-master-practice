import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();


        int rev = 0;
        for (int i = 0; i <=num; i++) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}