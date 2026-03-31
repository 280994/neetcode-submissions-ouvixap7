class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int curMax=1, curMin=1;

        for(int num:nums){
            int temp = num*curMax;
            curMax=Math.max(Math.max(temp, num*curMin), num);
            curMin=Math.min(Math.min(temp, num*curMin), num);
            result = Math.max(result, curMax);
        }
        return result;
    }
}
