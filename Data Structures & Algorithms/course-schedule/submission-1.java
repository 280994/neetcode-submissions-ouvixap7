class Solution {

    Map<Integer, List<Integer>> preMap = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            preMap.get(pre[0]).add(pre[1]);
        }

        for(int i=0; i<numCourses; i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int courseNum){
        if(preMap.get(courseNum).isEmpty()){
            return true;
        }
        if(visited.contains(courseNum)){
            return false;
        }
        visited.add(courseNum);
        for(int course:preMap.get(courseNum)){
            if(!dfs(course)){
                return false;
            }
        }
        visited.remove(courseNum);
        preMap.put(courseNum, new ArrayList<>());
        return true;
    }
}
