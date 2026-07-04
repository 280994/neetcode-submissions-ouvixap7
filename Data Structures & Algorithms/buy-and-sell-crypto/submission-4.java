class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit = 0;
        for(int sell:prices){
            if(sell>buy){
                profit = Math.max(profit, sell-buy);
            }
            else{
                buy = sell;
            }

        }
        return profit;
    }
}
