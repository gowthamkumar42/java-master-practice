import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scanner.nextInt();
        int original=num,sum=0,digits=0,temp=num;

        while(temp>0){
            temp/=10;
            digits++;
        }

        temp=num;
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp/=10;
        }
        if(original==sum){
            System.out.println("it is amstrong number");
        }else{
            System.out.println("not a amstrong number");
        }
    }
}
