package problems;

import java.util.Map;
import java.util.HashMap;

public class FindNonDuplicateNumber {
   public static void main(String[] args){
       int[] array = new int[]{3,2,2,3,4,5,6,4,5,6,1,7,7,7,8,8,9,9};
       var result = getResult(array);
       System.out.println(result);
   } 
   
   private static int getResult(int[] array){
       var map = new HashMap<Integer,Integer>();

       for(int number : array){
           if(map.containsKey(number)){
            int value = map.get(number);
            map.put(number, value +1);
           }else{
            map.put(number, 1);
           }
       }

       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
       }
       return -1;
   }

}
