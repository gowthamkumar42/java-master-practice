import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scanner.nextInt();
        boolean prime=true;

        if(num<=1){
            prime=false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        }
            System.out.println("the "+num+" is "+(prime?" prime number ":" not prime number "));
    }
}
