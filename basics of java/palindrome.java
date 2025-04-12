import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scanner.nextInt();

        int original=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }

        if(original==rev){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
    }
}
