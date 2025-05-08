import java.util.*;
public class center_right_left {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ArrayList<Integer>rcb=new ArrayList<>();
        int n= arr.length;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        for(int i=left;i<=right;i++){
//            rcb.add(arr[][i]);
        }
        top++;
        for(int i=top;i<bottom;i++){
            rcb.add(arr[top][i]);
        }
        for (int term:rcb){
            System.out.print(term+" ");
        }
    }
}
