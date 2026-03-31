class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> edges = new HashMap<>();
        for(int[] time:times){
            edges.put(time[0],new ArrayList<>());
        }
        for(int[] time:times){
            edges.get(time[0]).add(new int[]{time[1],time[2]});
        }
        int result=0;
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        minHeap.add(new int[]{0,k});
        Set<Integer> visited = new HashSet<>();

        while(!minHeap.isEmpty()){
            int[] p = minHeap.poll();
            if(visited.contains(p[1])){
                continue;
            }
            visited.add(p[1]);
            result=p[0];
            if(edges.containsKey(p[1])){
                for(int[] adjacent:edges.get(p[1])){
                    if(!visited.contains(adjacent[0])){
                        minHeap.add(new int[]{adjacent[1]+p[0],adjacent[0]});
                    }
                }
            }
        }
        return visited.size()==n?result:-1;
    }
}
