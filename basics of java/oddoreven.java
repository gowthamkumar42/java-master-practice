import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scanner.nextInt();

        if(num%2==0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is odd number");
        }
    }
}
