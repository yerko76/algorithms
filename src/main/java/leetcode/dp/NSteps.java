// package leetcode.dp;
// import java.util.*;

// /*
//  A child is running up a staircase with n steps and can hop either 1 step, 2 steps
//  or 3 steps at a time, implement a method to count how many possible ways the child
//  can run up the stair
// */

// public class NSteps {
//     public static void main(String[] args){
//         int n =37 ;
//         System.out.println(getSolutionmemo(n));
//     }

//     private static int getSolution(int n){
//         if(n < 0) return 0;
//         if(n==0) return 1;
//         return getSolution(n-1) + getSolution(n-2) + getSolution(n-3);
//     }

//     private static int getSolutionmemo(int n){
//         int[] memo = new int[n +1];
//         Arrays.fill(memo, -1);
//         return solutionMemo(n, memo);
//     }

//     private static int solutionMemo(int n, int[] memo){
//         if(n < 0) return 0;
//         if(n==0) return 1;
//         if(memo[n] != -1) return memo[n];
//         memo[n] = solutionMemo(n-1, memo) + solutionMemo(n-2, memo) + solutionMemo(n-3, memo);
//         return memo[n]; 
//     }
    
// }
