class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int l=0, result=0, maxFreq=0;
        int[] count = new int[128];
        for(int r=0; r<s.length(); r++){
            
            maxFreq=Math.max(maxFreq,++count[s.charAt(r)]);
            while((r-l+1)-maxFreq>k){
                count[s.charAt(l)]--;
                l++;
            }
            result=Math.max(result, r-l+1);
        }
        return result;
    }
}
