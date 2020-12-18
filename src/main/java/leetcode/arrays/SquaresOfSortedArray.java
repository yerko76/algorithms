package leetcode.arrays;
import java.util.*;

public class SquaresOfSortedArray {
    public static void main(String[] args){
        int[] nums = new int[] {-4,-1,0,3,10};
        System.out.println(Arrays.toString(getSolution(nums)));
    }
    
    private static int[] getSolution(int[] nums){
        int[] result = new int[nums.length];
        int i = 0;
        for(var num : nums){
            result[i] = num * num;
            i++;
        }
        Arrays.sort(result);
        return result;
    }
}
