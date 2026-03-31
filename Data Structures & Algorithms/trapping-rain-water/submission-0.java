class Solution {
    public int trap(int[] height) {
        int maxLeft=height[0];
        int maxRight = height[height.length-1];
        int i=0,j=height.length-1;
        int trappedWater=0;
        while(i<j){
            if(maxLeft<maxRight){
                i++;
                maxLeft = Math.max(maxLeft, height[i]);
                trappedWater += maxLeft-height[i];
            }
            else{
                j--;
                maxRight = Math.max(maxRight, height[j]);
                trappedWater += maxRight-height[j];
            }
        }
        return trappedWater;
    }
}
