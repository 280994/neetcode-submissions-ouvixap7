class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                return new int[]{numsMap.get(nums[i]),i};
            }
            else{
                numsMap.put(target-nums[i],i);
            }
        }
        return new int[]{};
    }
}
