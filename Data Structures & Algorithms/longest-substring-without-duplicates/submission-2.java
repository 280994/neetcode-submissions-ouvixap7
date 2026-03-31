class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0, result=0;
        Set<Character> charSet = new HashSet<>();
        while(j<s.length()){
            while(charSet.contains(s.charAt(j))){
                charSet.remove(s.charAt(i));
                i++;
            }
            charSet.add(s.charAt(j));
            result=Math.max(result, j-i+1);
            j++;
        }
        return result;
    }
}
