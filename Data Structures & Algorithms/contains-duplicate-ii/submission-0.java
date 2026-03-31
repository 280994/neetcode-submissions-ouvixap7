class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        if(k==0){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if(resultMap.containsKey(nums[i]) && i-resultMap.get(nums[i])<=k){
                return true;
            }
            resultMap.put(nums[i], i);
        }
        return false;
    }
}