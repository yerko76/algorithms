package algoexpert.arrays;

import java.util.*;

public class TreeNumberSum {
    public static void main(String[] args){
        int[] array = new int[]{12,3,1,2,-6,5,-8,6};
        int targetSum = 0;
        var result = getSolution(array, targetSum);
    
        System.out.println(Arrays.toString(result.get(0)));
    }


    public static List<Integer[]> getSolution(int[] array, int targetSum) {
        List<Integer[]> triplets = new ArrayList<>();
        Arrays.sort(array);
        for(int i =0; i< array.length -2; i++){
            int left = i+1;
            int right = array.length -1;
            while(left < right){
                int currentSum = array[i] + array[left] + array[right];
                if(currentSum == targetSum){
                    Integer[] triplet = new Integer[]{array[i], array[left], array[right]};
                    triplets.add(triplet);
                    left++;
                    right--;
                }else if(currentSum < targetSum){
                    left++;
                }else if(currentSum > targetSum){
                    right--;
                }
            }
        }
        return triplets;
      }
    
}
