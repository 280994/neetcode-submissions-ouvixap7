class Solution {
    public boolean hasDuplicate(int[] nums) {
      if(nums.length>1){
            Set<Integer> numSet=new HashSet<>();
            for(int i:nums){
                if(numSet.contains(i)){
                    return true;
                }
                else{
                    numSet.add(i);
                }
            }
        }
        return false;  
    }
}