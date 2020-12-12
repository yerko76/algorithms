package problems;
import java.util.*;

public class TopKFrecuentElements {
    public static void main(String[] args){
        int[] array = new int[]{3,3,4,1,1,1,1,1,7,7,7,8,9,10,6};
        System.out.println(getSolution(array, 3));
    }

    private static List<Integer> getSolution(int[] array, int k){
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue()- a.getValue());
        Map<Integer,Integer> occurrences = new HashMap<>();
        for(int num : array){
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : occurrences.entrySet()){
            queue.add(entry);
        }

        int i =1;
        while(i <= k){
            result.add(queue.poll().getKey());
            i++;
        }


        return result;
    }
    
}
