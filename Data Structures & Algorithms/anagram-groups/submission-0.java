class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for(String s:strs){
            char[] s2 = s.toCharArray();
            Arrays.sort(s2);
            String sortedStr= new String(s2);
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(s);
        }
       
        return new ArrayList<>(anagramMap.values());


    }
}
