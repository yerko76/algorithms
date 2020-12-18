package problems.arrays;

public class SearchMatrix {
    public static void main(String[] args){
        int[][] matrix = new int[][] {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,50}
        };
        int[][] matrix1 = new int[][]{{1,1}};
System.out.println(getSolution(matrix1,0));
    }
       
    private static boolean getSolution(int[][] matrix, int target){
        if(matrix.length == 0) return false; 
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int low =0;
        int hight = numRows * numCols;
        
        while(low < hight){
            int mid = (low + hight) /2;
            int midValue = matrix[mid/numCols][mid % numCols];
            if(midValue == target) return true;
            if(midValue< target){
                low = mid + 1;
            }else{
                hight = mid;
            }
        }
        return false;
    }
}
/*
if len(mat) == 0:
    return False

  rows = len(mat)
  cols = len(mat[0])

  low = 0
  high = rows * cols
  while low < high:
    mid = (low + high) // 2
    mid_value = mat[mid // cols][mid % cols]

    if mid_value == value:
      return True
    if mid_value < value:
      low = mid + 1
    else:
      high = mid

  return False


mat = [
    [1, 3, 5, 8],
    [10, 11, 15, 16],
    [24, 27, 30, 31],
]
*/