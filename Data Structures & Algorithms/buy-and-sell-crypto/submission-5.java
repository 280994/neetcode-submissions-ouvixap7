class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit = 0;
        for(int sell:prices){
            profit = Math.max(profit, sell-buy);
            buy = Math.min(buy, sell);
        }
        return profit;
    }
}
