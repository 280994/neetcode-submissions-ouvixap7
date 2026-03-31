class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(result, subset, 0, nums);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> subset, int i, int[] nums){
        if(i==nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(result, subset, i+1,nums);
        subset.remove(subset.size()-1);
        while(i<nums.length-1 && nums[i]==nums[i+1]){
            i++;
        }
        dfs(result, subset, i+1,nums);
    }
}
