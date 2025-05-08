import java.util.Scanner;
public class find_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row length: ");
        int r = sc.nextInt();
        System.out.println("Enter column length: ");
        int c = sc.nextInt();
        System.out.println("Enter elements: ");
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to find: ");
        int f=sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==f){
                    System.out.println("true");
                    break;
                }
                }
            }
        }
    }
