package problems.arrays;
import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args){
        int[][] matrix = new int[][]{
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        //1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12
        System.out.println(execute(matrix));
    }

    private static List<Integer> execute(int[][] matrix){
        List<Integer> result = new ArrayList<>();
		int startColumn = 0;
		int endColumn = matrix[0].length -1;
		int startRow = 0;
		int endRow = matrix.length -1;
		
		while(startRow <= endRow && startColumn <= endColumn){
			for(int i = startColumn; i<= endColumn; i++){
				result.add(matrix[startRow][i]);
			}
			startRow++;
			
			for(int i=startRow; i<= endRow; i++){
				result.add(matrix[i][endColumn]);
			}
			endColumn--;
			
			if(startRow <= endRow){
				for(int i=endColumn; i>= startColumn; i--){
					result.add(matrix[endRow][i]);
				}
				endRow--;
			}
			
			if(startColumn <= endColumn){
				for(int i=endRow; i>=startRow; i--){
					result.add(matrix[i][startColumn]);
				}
				startColumn++;
			}
		}
		return result; 
    }
    
}
