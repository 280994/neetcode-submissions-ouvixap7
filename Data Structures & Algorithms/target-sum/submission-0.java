class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> dp = new HashMap<>();
        return helper(nums, target, 0 , 0, dp);
    }

    private int helper(int[] nums, int target, int i, int cur_sum, Map<String, Integer> dp){
        String key = i+"-"+cur_sum;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        if(i==nums.length){
            if(cur_sum==target){
                return 1;
            }
            else{
                return 0;
            }
        }
        dp.put(key, helper(nums, target, i+1, cur_sum+nums[i], dp) + helper(nums, target, i+1, cur_sum-nums[i], dp));
        return dp.get(key);
    }
}
