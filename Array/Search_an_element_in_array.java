import java.util.Scanner;
public class Search_an_element_in_array {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n= scanner.nextInt();

        int []arr=new int[n];
        System.out.println("Enter array values: ");
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int search= scanner.nextInt();

        boolean found=true;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
            System.out.println("Element " + search + " found at index " + i);
            found=true;
            break;}
        }
        if(found==false){
            System.out.println("Element " + search + " not found in the array.");
        }
    }
}
