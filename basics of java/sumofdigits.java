import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scanner.nextInt();
        int digit=0;


        for(int i=0;i<=num;i++){
            digit=digit+num%10;
            num/=10;
        }
        System.out.println("sum of digit is: "+digit);
    }
}
