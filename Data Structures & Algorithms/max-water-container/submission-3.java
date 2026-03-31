class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1;
        int result=Integer.MIN_VALUE;
        while(i<j){
            int area = Math.min(heights[i],heights[j])*(j-i);
            result=Math.max(result,area);
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
