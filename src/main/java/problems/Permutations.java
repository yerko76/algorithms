package problems;

import java.util.*;

public class Permutations {
   public static void main(String[] args){
       int[] array = new int[]{1,2,3};
       System.out.println(getResult(array));
   } 

   private static List<List<Integer>> getResult(int[] array){
    List<List<Integer>> result = new ArrayList<>();
    executePermutations(array, 0, result);
    return result;
   }

   private static void executePermutations(int[] array, int index, List<List<Integer>> result){
       if(index == array.length){
           List<Integer> permutation = new ArrayList<>(array.length);
           for(Integer element : array){
               permutation.add(element);
           }
           result.add(permutation);
       }else{
           for(int i = index; i < array.length;i++){
               int temp = array[index];
               array[index] = array[i];
               array[i] = temp;
               executePermutations(array, index+1, result);
               temp = array[index];
               array[index] = array[i];
               array[i] = temp;
           }
       }
   }
}
