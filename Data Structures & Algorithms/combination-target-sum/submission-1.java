class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(result, subset, 0, nums, target);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> subset, int i, int[] nums, int target){
        if(target==0){
            result.add(new ArrayList<>(subset));
            return;
        }

        if(i>=nums.length || target<0){
            return;
        }

        subset.add(nums[i]);
        dfs(result, subset, i, nums, target-nums[i]);
        subset.remove(subset.size()-1);
        dfs(result, subset, i+1, nums, target);
    }
}
