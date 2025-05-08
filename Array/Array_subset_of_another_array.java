import java.util.HashSet;

class Array_subset_of_another_array{
        public static boolean isSubset(int[]arr1,int[]arr2){
            HashSet<Integer> set=new HashSet<>();

            for(int num:arr1){
                set.add(num);
            }

            for(int num:arr2){
                if(!set.contains(num))
                return false;
            }
            return true;
        }

        public static void main(String args[]){
            int[]arr1={1,2,3,4,5,6};
            int[]arr2={1,2,3};
            System.out.println(isSubset(arr1,arr2));

        }
    }
