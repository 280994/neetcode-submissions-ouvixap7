class Solution {

    Map<Integer,List<Integer>> preMap = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            preMap.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int numCrs){
        if(visited.contains(numCrs)){
            return false;
        }
        if(preMap.get(numCrs).isEmpty()){
            return true;
        }
        visited.add(numCrs);
        for(int i:preMap.get(numCrs)){
            if(!dfs(i)){
                return false;
            }
        }
        visited.remove(numCrs);
        preMap.put(numCrs,new ArrayList<>());
        return true;
    }
}
