package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class FourSumTwo {
    public static void main(String[] args){
        int[] A = new int[] {1,2};
        int[] B = new int[] {-2,-1};
        int[] C = new int[] {-1,2};
        int[] D = new int[] {0,2};

        System.out.println(getResult(A,B,C,D));
    }

    private static int getResult(int[] A, int[] B, int[] C, int[] D){
        int counter = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< A.length; i++){
            for(int j = 0; j< B.length;j++){
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1); 
            }
        }

        for(int i = 0; i<C.length;i++){
            for(int j = 0; j<D.length; j++){
                int sum = C[i] + D[j];
                counter += map.getOrDefault(-sum, 0);
            }
        }

        return counter;
    }
    
}
