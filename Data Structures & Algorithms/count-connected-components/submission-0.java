class Solution {
    public int countComponents(int n, int[][] edges) {
        Map<Integer,List<Integer>> adj = new HashMap<>();
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            adj.put(i,new ArrayList<>());
        }

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int result=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i, visited, adj);
                result++;
            }
        }
        return result;

    }

    private void dfs(int node, boolean[] visited, Map<Integer,List<Integer>> adj){
        visited[node]=true;
        for(int i:adj.get(node)){
            if(!visited[i]){
                dfs(i,visited,adj);
            }
        }
    }


}
