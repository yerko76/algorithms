package problems.arrays;

public class MaxSumSubArray {
    public static void main(String[] args){
        int[] array = new int[]{4,2,1,7,8,1,2,8,1,0};
        int k = 3;
        System.out.println(findMaxSum(array, k));
    }

    private static int findMaxSum(int[] array, int k){
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for(int i= 0; i<array.length; i++){
            currentRunningSum += array[i];
            if(i >= k-1){
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum -= array[i - (k-1)];
            }
        }
        return maxValue;
    }
    
}
