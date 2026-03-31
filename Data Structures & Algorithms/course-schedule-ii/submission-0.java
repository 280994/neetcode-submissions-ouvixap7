class Solution {

    Map<Integer,List<Integer>> preMap = new HashMap<>();
    Set<Integer> cycle = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    List<Integer> output = new ArrayList<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for(int i=0; i<numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            preMap.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i)){
                return new int[]{};
            }
        }
        int[] result = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            result[i]=output.get(i);
        }
        return result;
    }

    private boolean dfs(int curr){
        if(cycle.contains(curr)){
            return false;
        }
        if(visited.contains(curr)){
            return true;
        }

        cycle.add(curr);
        for(int pre:preMap.get(curr)){
            if(!dfs(pre)){
                return false;
            }
        }
        cycle.remove(curr);
        visited.add(curr);
        output.add(curr);
        return true;
    }
}
