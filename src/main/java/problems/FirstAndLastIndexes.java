package problems;

import java.util.Arrays;

public class FirstAndLastIndexes {
   public static void main(String[] args){
       var array = new int[] {1,3,3,5,7,8,9,9,9,15};
       var result = getResult(array, 9);
       System.out.print(Arrays.toString(result));
   } 

   private static int[] getResult(int[] array, int target){
        int[] result = new int[2];
        result[0] = binarySearch(array, target);
        result[1] = binarySearchLast(array, target);

       return result;
   }

   private static int binarySearch(int[] array, int target){
       int start = 0;
       int end = array.length -1;
       int index = -1;

       while(start <= end){
            int mid = start + (end - start)/2;
            if(target == array[mid]){
                index = mid;
            }
            if(array[mid] >= target){
                end = mid -1;
            }else{
                start = mid +1;
            }
       }

       return index;
   }

   private static int binarySearchLast(int[] array, int target){
    int start = 0;
    int end = array.length -1;
    int index = -1;

    while(start <= end){
         int mid = start + (end - start)/2;
         if(target == array[mid]){
             index = mid;
         }
         if(array[mid] <= target){
             start = mid +1;
         }else{
             end = mid -1;
         }
    }

    return index;
}
}
