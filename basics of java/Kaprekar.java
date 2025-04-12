import java.util.Scanner;
public class Kaprekar {
    public static boolean Kaprekar(int n){
        if(n==1){
            return true;
        }
        long sqare =(long)n*n;
        String str=String.valueOf(sqare);

        for(int i=1;i<str.length();i++){
            String leftside=str.substring(0,i);
            String rightside=str.substring(i);

            int left=Integer.parseInt(leftside);
            int right=Integer.parseInt(rightside);
             if(right!=0 && right+left==n){
                 return true;
             }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(Kaprekar(n)){
            System.out.println("the number is Kaprekar");
        }else {
            System.out.println("the number is not a Kaprekar");
        }
    }
}
