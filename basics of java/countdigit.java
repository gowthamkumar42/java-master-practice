import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        int count=0;
        int sum;

        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println("the count digit is: "+count);
    }
}
