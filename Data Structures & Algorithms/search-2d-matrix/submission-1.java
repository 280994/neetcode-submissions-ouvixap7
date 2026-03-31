class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int i=0, j=(rows*cols)-1;
        while(i<=j){
            int mid = (i+j)/2;
            int row = mid/cols;
            int col = mid%cols;
            if(target>matrix[row][col]){
                i=mid+1;
            }
            else if(target<matrix[row][col]){
                j=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
