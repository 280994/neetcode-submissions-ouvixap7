class Solution {
    public int maxArea(int[] heights) {
        int i=0, j=heights.length-1;
        int result=0;
        while(i<j){
            int trappedWater = ((j-i)*Math.min(heights[i], heights[j]));
            result=Math.max(result, trappedWater);
            if(heights[i]>heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return result;
    }
}
