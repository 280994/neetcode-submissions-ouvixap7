class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0,r=matrix[0].length,top=0,bottom=matrix.length;
        List<Integer> result = new ArrayList<>();
        while(l<r && top<bottom){
            for(int i=l;i<r;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<bottom;i++){
                result.add(matrix[i][r-1]);
            }
            r--;
            if(!(l<r && top<bottom)){
                break;
            }
            for(int i=r-1;i>=l;i--){
                result.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i=bottom-1;i>=top;i--){
                result.add(matrix[i][l]);
            }
            l++;
        }
        return result;
    }
}
