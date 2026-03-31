class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        for(int i=0; i<lis.length;i++){
            lis[i]=1;
        }

        for(int i=nums.length-1; i>=0;i--){
            for(int j=i+1; j<nums.length;j++){
                if(nums[j]>nums[i]){
                    lis[i]=Math.max(lis[i], 1+lis[j]);
                }
            }
        }
        return Arrays.stream(lis).max().getAsInt();
    }
}
