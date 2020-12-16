package leetcode;
/*
Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.
Find the maximum coins you can collect by bursting the balloons wisely.
Note:
You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
*/
public class BurstBallons {
    public static void main(String[] args){
        var ballons = new int[]{3,1,5,8};
        System.out.println(getSolution(ballons));
    }

    private static int getSolution(int[] nums){
        return helper(nums);
    }

    private static int helper(int[] nums){
        return 0;
    }
    
}
