class Solution {
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int rows=matrix.length;
        int cols = matrix[0].length;
        dp=new int[rows][cols];
        int result=0;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                result=Math.max(result, dfs(matrix, r, c, -1, rows, cols, dp));
            }
        }
        return result;
    }

    private int dfs(int[][] matrix, int row, int col, int preVal, int rows, int cols, int[][] dp){
        if(row<0 || row>=rows || col<0 || col>=cols || matrix[row][col]<=preVal){
            return 0;
        } 
        if(dp[row][col]>0){
            return dp[row][col];
        }

        int result=0;
        result = Math.max(result, 1+dfs(matrix, row+1, col, matrix[row][col], rows, cols, dp));
        result = Math.max(result, 1+dfs(matrix, row-1, col, matrix[row][col], rows, cols, dp));
        result = Math.max(result, 1+dfs(matrix, row, col+1, matrix[row][col], rows, cols, dp));
        result = Math.max(result, 1+dfs(matrix, row, col-1, matrix[row][col], rows, cols, dp));
        dp[row][col]=result;
        return result;
    }
}
