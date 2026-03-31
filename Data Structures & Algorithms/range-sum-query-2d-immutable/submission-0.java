class NumMatrix {
    int[][] sumMatrix;
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        sumMatrix = new int[rows+1][cols+1];
        for(int r=0; r<rows; r++){
            int prefixSum=0;
            for(int c=0; c<cols; c++){
                prefixSum+=matrix[r][c];
                int above = sumMatrix[r][c+1];
                sumMatrix[r+1][c+1] = prefixSum+above;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;row2++;col1++;col2++;
        int bottomRight = sumMatrix[row2][col2];
        int above = sumMatrix[row1-1][col2];
        int left = sumMatrix[row2][col1-1];
        int common = sumMatrix[row1-1][col1-1];
        return bottomRight-above-left+common;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */