class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for(String str: strs){
            int[] count = new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            String s = Arrays.toString(count);
            groups.putIfAbsent(s, new ArrayList<>());
            groups.get(s).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}
