package algoexpert.arrays;

import java.util.*;

public class TwoNumberSum {
    public static void main(String[] args){
        int array[] = new int[]{3,5,-4,8,11,1,-1,6};
        int target = 10;
        var result = getSolution(array, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getSolution(int[] array, int target){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< array.length;i++){
            int complement =  target - array[i];
            if(set.contains(complement)){
                return new int[]{complement, array[i]};
            }else{
                set.add(array[i]);
            }
        }
        return new int[0];
    }
    
}
