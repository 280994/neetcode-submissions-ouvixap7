class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit=0;
        for(int price:prices){
            if(min<price){
                profit=profit+(price-min);
            }
            min=price;
        }
        return profit;
    }
}