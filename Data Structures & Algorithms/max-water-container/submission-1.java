class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1,max=0;
       while(i<j){
        max = Math.max(max, (Math.min(heights[i], heights[j])*(j-i)));
        if(heights[i]<=heights[j]){
            i++;
        }
        else if(heights[i]>heights[j]){
            j--;
        }
       } 
        return max;
    }
}
