class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String, Integer> dp = new HashMap<>();
        return helper(nums, target, 0, 0, dp);
    }

    private int helper(int[] nums, int target, int i, int cur_sum, Map<String, Integer> dp){
        String key = i+"-"+cur_sum;
        if(i==nums.length){
            return cur_sum==target?1:0;
        }
        if(dp.containsKey(key)){
            return dp.get(key);
        }

        dp.put(key, helper(nums, target, i+1, cur_sum+nums[i], dp) + helper(nums, target, i+1, cur_sum-nums[i], dp));
        return dp.get(key);
    }
}
