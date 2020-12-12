package problems;

import java.util.List;
import java.util.ArrayList;

public class DiameterOfIslands {
    
    public static void main (String[] args){
        int[][] grid = {{1,1,0,0,0},
                        {0,1,0,0,1},
                        {1,0,0,1,1},
                        {0,0,0,0,0}
                    };
        var result = getResult(grid);
        System.out.print(result);
    }

    private static List<Integer> getResult(int[][] grid){
        var result = new ArrayList<Integer>();
        for(int row=0; row< grid.length; row++){
            for(int col=0;col<grid[row].length; col++){
                if(isIsland(grid, row, col)){
                    result.add(dfs(grid, row, col));
                }
            }
        }
        return result;
    }
    
    private static Integer dfs(int[][] grid, int row, int col){
        if(!isIsland(grid, row, col)) return 0;
        int result = 1;
        grid[row][col] = 0;
        result += dfs(grid, row-1, col);
        result += dfs(grid, row+1, col);
        result += dfs(grid, row, col -1);
        result += dfs(grid, row, col+1);
        return result;
    }

    private static boolean isIsland(int[][] grid, int row, int col){
        if(row <0 || row>= grid.length || col < 0 || col >= grid[row].length) return false;
        return grid[row][col] == 1;
    }
}
