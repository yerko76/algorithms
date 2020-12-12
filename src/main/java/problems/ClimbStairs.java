package problems;

public class ClimbStairs {
    public static void main(String[] args){
        int n =5;
        int[] memo = new int[n+1];
        System.out.println(climbStairs(n, memo));
    }

    private static int climbStairs(int n, int[] memo){
        if(n <= 1) return 1;
        if(memo[n] == n) return memo[n];
        memo[n] = climbStairs(n-1, memo) + climbStairs(n-2, memo);
        return memo[n];
    }
    
}
