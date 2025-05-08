import java.util.Scanner;
public class center_seqence_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int c=n/2;
        int up=0,down=0,left=0,right=0;
        //up
        for(int i=0;i<c;i++){
            up+=matrix[i][c];
        }
        //down
        for(int i=c+1;i<n;i++){
            down=down+matrix[i][c];
        }
        //left
        for(int i=0;i<c;i++){
            left+=matrix[c][i];
        }
        //right
        for(int i=c+1;i<n;i++){
            right+=matrix[c][i];
        }

        int min=Math.min(Math.min(up,down),(Math.min(left,right)));
        int max=Math.max(Math.max(up,down),(Math.max(left,right)));

        if(min-max==0){
            System.out.println("center sequence");
        }else{
            System.out.println("not center sequence");
        }
    }
}
