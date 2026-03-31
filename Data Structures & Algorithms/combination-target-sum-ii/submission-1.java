class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(candidates, target, 0, cur);
        return result;
    }

    private void dfs(int[] candidates, int target, int i, List<Integer> cur){
        if(target==0){
            result.add(new ArrayList(cur));
            return;
        }
        if(i>candidates.length-1 || target<0 || candidates[i]>target){
            return;
        }
        cur.add(candidates[i]);
        dfs(candidates, target-candidates[i], i+1, cur);
        cur.remove(cur.size()-1);
        while(i<candidates.length-1 && candidates[i]==candidates[i+1]){
            i++;
        }
        dfs(candidates, target, i+1, cur);
    }
}
