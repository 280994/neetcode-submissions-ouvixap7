class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int curSum = 0;
        for(int num:nums){
            if(curSum<0){
                curSum=0;
            }
            curSum+=num;
            result=Math.max(result, curSum);
        }
        return result;
    }
}
