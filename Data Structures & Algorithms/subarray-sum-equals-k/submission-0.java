class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0,1);
        int result=0, curSum = 0;
        for(int num:nums){
            curSum+=num;
            int diff = curSum-k;
            result+=prefixSum.getOrDefault(diff,0);
            prefixSum.put(curSum, prefixSum.getOrDefault(curSum,0)+1);
        }
        return result;
    }
}