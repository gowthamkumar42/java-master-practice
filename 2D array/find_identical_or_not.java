import java.util.Scanner;
public class find_identical_or_not {
    public static boolean identity(int arr[][],int r){
        boolean found=false;
        for(int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    if (arr[i][j] == 1) {
                        found = true;
                    }
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row length: ");
        int r = sc.nextInt();
        System.out.println("Enter column length: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(identity(arr,r));
    }

}
