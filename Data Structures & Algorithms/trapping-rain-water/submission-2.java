class Solution {
    public int trap(int[] height) {
        int maxLeft = height[0];
        int maxRight = height[height.length-1];
        int i=0, j=height.length-1, result=0;
        while(i<j){
            if(maxLeft<maxRight){
                i++;
                maxLeft=Math.max(maxLeft, height[i]);
                result=result+(maxLeft-height[i]);
            }
            else{
                j--;
                maxRight=Math.max(maxRight, height[j]);
                result=result+(maxRight-height[j]);
            }
        }
        return result;
    }
}
