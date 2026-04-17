class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int locations=0;

        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(grid[r][c]=='1'){
                    dfs(rows, cols, r, c, grid);
                    locations++;
                }
            }
        }
        return locations;
    }

    private void dfs(int rows, int cols, int r, int c, char[][] grid){
        if(r<0 || r>rows-1 || c<0 || c>cols-1 || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(rows, cols, r+1, c, grid);
        dfs(rows, cols, r-1, c, grid);
        dfs(rows, cols, r, c+1, grid);
        dfs(rows, cols, r, c-1, grid);

    }
}
