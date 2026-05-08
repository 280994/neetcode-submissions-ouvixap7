class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] anagrams = new int[26];
        for(int i=0; i<s.length();i++){
            anagrams[s.charAt(i)-'a']++;
            anagrams[t.charAt(i)-'a']--;
        }

        for(int i=0; i<26;i++){
            if(anagrams[i]>0){
                return false;
            }
        }
        return true;
    }
}
