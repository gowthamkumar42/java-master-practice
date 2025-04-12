import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= scanner.nextInt();
        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println("the number is perfect number");
        }else{
            System.out.println("the number is not a perfect number");
        }
        scanner.close();
    }
}
