class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0, sum=0, result=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            while(sum>=target){
                result= Math.min(i-j+1, result);
                sum-=nums[j];
                j++;
            }
        }
        return result == Integer.MAX_VALUE?0:result;
    }
}