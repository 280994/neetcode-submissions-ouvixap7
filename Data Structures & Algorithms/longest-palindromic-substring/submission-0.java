class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int resLength=0;
        String result = "";
        int n = s.length();
        for(int i=n-1; i>=0;i--){
            for(int j=i; j<n;j++){
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1])){
                    dp[i][j]=true;
                    if(resLength<(j-i+1)){
                        resLength=j-i+1;
                        result=s.substring(i,j+1);
                    }
                }
            }
        }
        return result;
    }
}
