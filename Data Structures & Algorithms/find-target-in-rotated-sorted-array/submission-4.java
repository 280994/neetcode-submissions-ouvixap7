class Solution {
    public int search(int[] nums, int target) {
        int i=0, j=nums.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(target==nums[mid]){
                return mid;
            }
            // left sorted portion
            else if(nums[mid]>=nums[i]){ 
                if(target>nums[mid] || target<nums[i]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            // right sorted portion
            else{
                if(target<nums[mid] || target>nums[j]){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
}
