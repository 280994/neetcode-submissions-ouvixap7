class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1, result=0;
       while(i<j){
            result=Math.max(result, (j-i)*Math.min(heights[i], heights[j]));
            if(heights[i]<=heights[j]){
                i++;
            }
            else{
                j--;
            }
       }
       return result;
    }
}
