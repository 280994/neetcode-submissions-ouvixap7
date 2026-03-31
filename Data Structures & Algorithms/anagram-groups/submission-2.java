class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            anagramMap.putIfAbsent(s1, new ArrayList<>());
            anagramMap.get(s1).add(s);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
