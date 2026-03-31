class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        if(total%2!=0){
            return false;
        }
        int target = total/2;
        HashSet<Integer> sumSet = new HashSet<>();
        sumSet.add(0);
        for(int i=nums.length-1; i>=0; i--){
            HashSet<Integer> copySet = new HashSet<>();
            for(int j:sumSet){
                if((nums[i]+j)==target){
                    return true;
                }
                copySet.add(nums[i]+j);
                copySet.add(j);
            }
            sumSet=copySet;
        }
        return false;
    }
}
