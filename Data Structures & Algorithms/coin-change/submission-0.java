class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=0; i<dp.length; i++){
            dp[i]=amount+1;
        }
        dp[0]=0;

        for(int i=0; i<=amount;i++){
            for(int c:coins){
                if(c<=i){
                    dp[i]=Math.min(dp[i],1+dp[i-c]);
                }
            }
        }
        if(dp[amount]==amount+1){
            return -1;
        }
        else{
            return dp[amount];
        }
    }
}
