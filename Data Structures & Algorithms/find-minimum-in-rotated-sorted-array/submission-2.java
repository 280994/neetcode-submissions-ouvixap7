class Solution {
    public int findMin(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[j]>nums[mid]){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        return nums[i];
    }
}
