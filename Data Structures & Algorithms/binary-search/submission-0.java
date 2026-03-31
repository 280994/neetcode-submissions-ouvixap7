class Solution {
    public int search(int[] nums, int target) {
        int midIndex = nums.length/2;
        int midNum = nums[midIndex];
        if(midNum==target){
            return midIndex;
        }
        else if(midNum>target){
            int i =0;
            while(i<midIndex){
                if(nums[i]==target){
                    return i;
                }
                i++;
            }
        }
        else{
            int i = nums.length-1;
            while(i>midIndex){
                if(nums[i]==target){
                    return i;
                }
                i--;
            }
        }
        return -1;
    }
}
