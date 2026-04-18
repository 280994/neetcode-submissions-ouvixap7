class Solution {

    private static final int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];

        for(int r=0; r<rows;r++){
            dfs(rows, cols, r, 0, pac, heights);
            dfs(rows, cols, r, cols-1, atl, heights);
        }

        for(int c=0; c<cols; c++){
            dfs(rows, cols, 0, c, pac, heights);
            dfs(rows, cols, rows-1, c, atl, heights);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(pac[r][c] && atl[r][c]){
                    result.add(Arrays.asList(r,c));
                }
            }
        }
        return result;
    }

    private void dfs(int rows, int cols, int r, int c,boolean[][] ocean, int[][] heights){
        ocean[r][c]=true;
        for(int[] dir:directions){
            int row = r+dir[0];
            int col = c+dir[1];
            if(row>=0 && row<rows && col>=0 && col<cols && !ocean[row][col] && heights[r][c]<=heights[row][col]){
                dfs(rows, cols, row, col, ocean, heights);
            }
        }
    }
}
