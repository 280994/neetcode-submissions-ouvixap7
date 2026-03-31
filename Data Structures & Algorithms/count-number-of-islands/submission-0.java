class Solution {

    private static final int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int islands=0;

        for(int r=0;r<rows;r++){
            for(int c=0; c<cols;c++){
                if(grid[r][c]=='1'){
                    dfs(r, c, rows, cols, grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(int r, int c, int rows, int cols, char[][] grid){
        if(r<0 || r>=rows || c<0 || c>=cols || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        for(int[] dir:directions){
            dfs(r+dir[0], c+dir[1], rows, cols, grid);
        }
    }
}
