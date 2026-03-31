class Solution {
    public int firstMissingPositive(int[] nums) {
       boolean[] isPresent = new boolean[nums.length];
        for(int num:nums){
            if(num>0 && num<=nums.length){
                isPresent[num-1]=true;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(!isPresent[i]){
                return i+1;
            }
        }
        return nums.length+1; 
    }
}