class Solution {
    public int search(int[] nums, int target) {
        int midIndex = nums.length/2;
        int mid = nums[midIndex];

        if(target==mid){
            return midIndex;
        }
        else if(target<mid){
            int i=0;
            while(i<midIndex){
                if(nums[i]==target){
                    return i;
                }
                i++;
            }
        }
        else{
            int i=nums.length-1;
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
