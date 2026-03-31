class Solution {
    public int numDecodings(String s) {
        Map<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(),1);
        return helper(s, 0, dp);
    }

    private int helper(String s, int i, Map<Integer, Integer> dp){
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        if(s.charAt(i)=='0'){
            return 0;
        }

        int result=helper(s,i+1,dp);
        if((i+1)<s.length() && (s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<'7'))){
            result+=helper(s,i+2,dp);
        }
        dp.put(i,result);
        return result;
    }
}
