package problems.arrays;

public class FillMatrixSpiralOrder {
    //123
    //894
    //765
    public static void main(String[] args){
        int n = 3;
        var matrix = getMatrix(n);

        for(int row = 0; row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.println(matrix[row][col]);
            }
        }

    }

    private static int[][] getMatrix(int n){
        int[][] matrix = new int[n][n];
        int beginRow = 0;
        int beginCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;
        int counter =1;

        while(beginRow <= endRow && beginCol <= endCol){
            for(int i=beginCol; i<=endCol;i++){
                matrix[beginRow][i] = counter;
                counter++;
            }
            beginRow++;
            
            for(int i= beginRow; i<= endRow;i++){
                matrix[i][endCol] = counter;
                counter++;
            }
            endCol--;

            if(beginRow <= endRow){
                for(int i = endCol; i>= beginCol; i--){
                    matrix[endRow][i] = counter;
                    counter++;
                }
            }
            endRow--;

            if(beginCol <= endCol){
                for(int i = endRow; i>= beginRow; i--){
                    matrix[i][beginCol] = counter;
                    counter++;
                }
            }
            beginCol++;
       
        }
        return matrix;
    }
    
}
