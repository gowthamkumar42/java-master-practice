import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a numner: ");
        int num= scanner.nextByte();
        int first=0,second=1,next;

        System.out.println("the Fibonacci series "+first+" "+second);
        for(int i=0;i<num;i++){
            next=first+second;
            System.out.println(" "+next);
            first=second;
            second=next;
        }
    }
}
