class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> anagramMap1 = new HashMap<>();
        Map<Character, Integer> anagramMap2 = new HashMap<>();
        for(int i =0; i<s.length();i++){
            anagramMap1.put(s.charAt(i), anagramMap1.getOrDefault(s.charAt(i),0)+1);
            anagramMap2.put(t.charAt(i), anagramMap2.getOrDefault(t.charAt(i),0)+1);
        }
        return anagramMap1.equals(anagramMap2);
    }
}
