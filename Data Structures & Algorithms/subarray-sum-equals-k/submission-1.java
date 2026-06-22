class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixMap = new HashMap<>();
        prefixMap.put(0,1);
        int curSum=0, result=0;

        for(int num:nums){
            curSum+=num;
            int diff = curSum-k;
            result=result+prefixMap.getOrDefault(diff,0);
            prefixMap.put(curSum, prefixMap.getOrDefault(curSum,0)+1);
        }
        return result;
    }
}