package problems.dfs;

public class MaxConnectedColors {
    public static void main(String[] args){
        int[][] grid = {{1,0,0,0,0},
                        {1,1,1,1,0},
                        {0,0,0,0,0},
                        {1,1,1,1,1},
                        {0,1,0,0,0}, 
                        {0,0,0,0,0},
                        {1,1,1,1,1},
                       };
        System.out.print(getResult(grid));
    }


    private static int getResult(int[][] grid){
        int maxConnectedColors = 0;
        for(int row = 0; row< grid.length; row ++){
            for(int col =0; col < grid[row].length; col++){
                if(isConnected(grid, row, col)){
                    maxConnectedColors = Math.max(maxConnectedColors, dfs(grid,row, col));
                }
            }
        }
        return maxConnectedColors;
    }

    private static int dfs(int[][] grid, int row, int col){
        if(!isConnected(grid, row, col)) return 0;
        int result = 1;
        grid[row][col] = 0;
        result += dfs(grid, row-1, col);
        result += dfs(grid, row+1, col);
        result += dfs(grid, row, col -1);
        result += dfs(grid, row, col+1);

        return result;
    }


    private static boolean isConnected(int[][] grid, int row, int col){
        if(row <0 || row>= grid.length || col < 0 || col >= grid[row].length) return false;
        return grid[row][col] == 1;
    }

}
