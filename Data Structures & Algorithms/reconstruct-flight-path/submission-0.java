class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,List<String>> adj = new HashMap<>();
        tickets.sort((a,b)->a.get(1).compareTo(b.get(1)));
        for(List<String> s:tickets){
            adj.computeIfAbsent(s.get(0),key->new ArrayList<>()).add(s.get(1));
        }

        List<String> result=new ArrayList<>();
        result.add("JFK");

        if(dfs(adj,result,"JFK",tickets.size()+1)){
            return result;
        }
        return new ArrayList<>();

    }

    private boolean dfs(Map<String,List<String>> adj, List<String> result, String src, int length){
        if(result.size()==length){
            return true;
        }
        if(!adj.containsKey(src)){
            return false;
        }

        List<String> temp = new ArrayList<>(adj.get(src));
        for(int i=0; i<temp.size();i++){
            String nextSrc = temp.get(i);
            adj.get(src).remove(i);
            result.add(nextSrc);
            if(dfs(adj,result,nextSrc,length)){
                return true;
            }
            adj.get(src).add(i,nextSrc);
            result.remove(result.size()-1);
        }
        return false;
    }
}
