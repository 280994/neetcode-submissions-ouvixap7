class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(result, subset, 0, candidates, target);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> subset, int i, int[] candidates, int target){
        if(target==0){
            result.add(new ArrayList<>(subset));
            return;
        }
        if(i>candidates.length-1 || target<0){
            return;
        }

        subset.add(candidates[i]);
        dfs(result, subset, i+1, candidates, target-candidates[i]);
        subset.remove(subset.size()-1);
        while(i<candidates.length-1 && candidates[i]==candidates[i+1]){
            i++;
        }
        dfs(result, subset, i+1, candidates, target);
    }
}
