class Solution {
    LinkedList<String> result = new LinkedList<>();
    Map<String,PriorityQueue<String>> adj = new HashMap<>();
    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> ticket:tickets){
            adj.computeIfAbsent(ticket.get(0),key->new PriorityQueue<>()).add(ticket.get(1));
        }
        dfs("JFK");
        return result;

    }

    private void dfs(String src){
        PriorityQueue<String> dest = adj.get(src);
        while(dest!=null && !dest.isEmpty()){
            dfs(dest.poll());
        }
        result.addFirst(src);
    }
}
