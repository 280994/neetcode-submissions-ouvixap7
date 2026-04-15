class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combs = new ArrayList<>();
        dfs(result, combs, n, k, 1);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> combs, int n, int k, int start){
        if(combs.size()==k){
            result.add(new ArrayList<>(combs));
            return;
        }

        for(int i=start; i<=n;i++){
            combs.add(i);
            dfs(result, combs, n, k, i+1);
            combs.remove(combs.size()-1);
        }
    }
}