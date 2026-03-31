class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }

    private void divide(int[] nums, int l, int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        divide(nums, l, mid);
        divide(nums, mid+1, r);
        merge(nums, l,r,mid);
    }

    private void merge(int[] nums, int l, int r, int mid){
        int[] left = Arrays.copyOfRange(nums,l,mid+1);
        int[] right = Arrays.copyOfRange(nums, mid+1, r+1);
        int i=l, j=0,k=0;

        while(j<left.length && k<right.length){
            if(left[j]<=right[k]){
                nums[i]=left[j++];
            }
            else{
                nums[i]=right[k++];
            }
            i++;
        }

        while(j<left.length){
            nums[i]=left[j++];
            i++;
        }
        while(k<right.length){
            nums[i]=right[k++];
            i++;
        }
    }
}