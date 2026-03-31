class Solution {
    public int findMin(int[] nums) {
        int i=0, j=nums.length-1, result = nums[0];
        while(i<=j){
            if(nums[i]<nums[j]){
                result=Math.min(result,nums[i]);
                break;
            }
            int mid = i+(j-i)/2;
            result=Math.min(result, nums[mid]);
            if(nums[mid]>=nums[j]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return result;
    }
}
