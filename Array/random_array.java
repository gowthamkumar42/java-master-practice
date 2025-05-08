import java.util.Scanner;
import java.util.Random;
public class random_array {
    public static void printarray(int len){
        Random rd = new Random();

        int[]arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100);
        }
        for (int term : arr) {
            System.out.print(term+"  ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int len = sc.nextInt();

        printarray(len);

        }
    }


