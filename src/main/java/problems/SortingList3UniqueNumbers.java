package problems;

import java.util.*;

public class SortingList3UniqueNumbers {
    public static void main(String[] args){
        int[] numbers = new int[] {3,3,2,1,3,2,1};
        var result = getResult(numbers);
        System.out.println(Arrays.toString(result));
    }    

    private static int[] getResult(int[] array){
        int left = 0;
        int right = array.length -1;
        int i = 0;
        while(i <= right){
            if(array[i] == 1){
                int temp = array[i];
                array[i] = array[left];
                array[left] =temp;
                left++;
                i++;
            }
            if(array[i] == 2){
                i++;
            }
            if(array[i] == 3){
                int temp = array[i];
                array[i] = array[right];
                array[right] = temp;
                right--;
            }
        }
        return array;
    }
}
