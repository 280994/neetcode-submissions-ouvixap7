class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m;i++){
            dp[i][n]=m-i;
        }
        for(int i=0; i<=n;i++){
            dp[m][i]=n-i;
        }

        for(int r=m-1; r>=0; r--){
            for(int c=n-1; c>=0; c--){
                if(word1.charAt(r)==word2.charAt(c)){
                    dp[r][c]=dp[r+1][c+1];
                }
                else{
                    dp[r][c] = 1+Math.min(Math.min(dp[r+1][c], dp[r][c+1]), dp[r+1][c+1]);
                }
            }
        }
        return dp[0][0];
    }
}
