public class Check_if_two_arrays_are_equal_or_not {
    public static void main (String args[]){
        int[]arr1={1234};
        int[]arr2={1234};
        boolean equalornot=true;

        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    equalornot=false;
                    System.out.println("arrays are not equal");
                    break;
                }
            }
            if(equalornot==true){
                System.out.println("arrays are equal");
            }
        }
        else{
            equalornot=false;
            System.out.println("not equal");
        }
    }
}
