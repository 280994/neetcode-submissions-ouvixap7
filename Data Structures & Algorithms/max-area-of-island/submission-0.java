class Solution {

    private static final int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int area=0;

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]==1){
                    area=Math.max(area,dfs(r,c,rows,cols,grid));
                }
            }
        }
        return area;
    }

    private int dfs(int r, int c, int rows, int cols, int[][] grid){
        if(r<0 || r>=rows || c<0 || c>=cols || grid[r][c]==0){
            return 0;
        }
        grid[r][c]=0;
        int area=1;
        for(int[] dir:directions){
            area=area+dfs(r+dir[0], c+dir[1], rows, cols, grid);
        }
        return area;
    }
}
