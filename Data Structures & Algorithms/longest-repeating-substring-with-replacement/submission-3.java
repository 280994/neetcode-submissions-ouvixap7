class Solution {
    public int characterReplacement(String s, int k) {
        int i=0, result=0, maxf=0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        for(int j=0; j<s.length(); j++){
            charMap.put(s.charAt(j), charMap.getOrDefault(s.charAt(j), 0)+1);
            maxf=Math.max(maxf, charMap.get(s.charAt(j)));
            while((j-i+1-maxf)>k){
                charMap.put(s.charAt(i), charMap.get(s.charAt(i))-1);
                i++;
            }
            result=Math.max(result, j-i+1);
        }
        return result;
    }
}
