class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strMap = new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            strMap.putIfAbsent(s1,new ArrayList<>());
            strMap.get(s1).add(s);
        }
        return new ArrayList<>(strMap.values());
    }
}
