class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagramMap = new HashMap<>();
        for(String s:strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String s1 = new String(sArray);
            anagramMap.putIfAbsent(s1, new ArrayList<>());
            anagramMap.get(s1).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
