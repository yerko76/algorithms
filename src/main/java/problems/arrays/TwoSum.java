package problems.arrays;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
   public static void main(String[] args){
       int[] array = {2,7,11,15};
       var result = getResult(array, 18);
       System.out.print(Arrays.toString(result));
   }

   private static int[] getResult(int[] array, int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            int difference = target - array[i];
            if(map.containsKey(difference)){
                result[0] = i;
                result[1] = map.get(difference);
                return new int[]{i,map.get(difference)};
            }
            map.put(array[i], i);
        }
        System.out.println(map);
        return result;
   }
}