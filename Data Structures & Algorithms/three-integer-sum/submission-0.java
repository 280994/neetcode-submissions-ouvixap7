class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1, r=nums.length-1;
            while(j<r){
                int sum = nums[i]+nums[j]+nums[r];
                if(sum>0){
                    r--;
                }
                if(sum<0){
                    j++;
                }
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[r]));
                    j++;
                    r--;
                    while(j<r && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
