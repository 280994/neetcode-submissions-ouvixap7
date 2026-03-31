class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(0, cur, target, nums);
        return result;
    }

    private void dfs(int i, List<Integer> cur, int target, int[] candidates){
        if(target==0){
            result.add(new ArrayList<>(cur));
            return;
        }
        if(i>=candidates.length || target<0){
            return;
        }
        cur.add(candidates[i]);
        dfs(i,cur, target-candidates[i], candidates);
        cur.remove(cur.size()-1);
        dfs(i+1, cur, target, candidates);
    }
}
