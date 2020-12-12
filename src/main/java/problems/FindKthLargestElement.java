package problems;
import java.util.*;


public class FindKthLargestElement {
    public static void main(String[] args){
        int[] array = new int[]{1,5,7,8,2,13,3,44,99,88,11,12,78};
        System.out.println(Arrays.toString(getSolution(array, 3)));
    }

    private static int[] getSolution(int[] array, int k){
        int[] result = new int[k];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : array){
            maxHeap.add(num);
        }

        int i = 0;
        while(i < k){
            result[i] = maxHeap.poll();
            i++;
        }

        return result;
    }

    
}
