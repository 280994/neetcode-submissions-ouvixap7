class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int i=0, j=rows*cols-1;
        
        while(i<=j){
            int m = (i+j)/2;
            int row = m/cols;
            int col = m%cols;
            if(target>matrix[row][col]){
                i=m+1;
            }
            else if(target<matrix[row][col]){
                j=m-1;
            }
            else
                return true;
        }
        return false;
    }
}
