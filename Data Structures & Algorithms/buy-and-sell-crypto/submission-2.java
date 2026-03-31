class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE, result=0;
        for(int price:prices){
            if(price<buy){
                buy=price;
            }
            else{
                result=Math.max(result, price-buy);
            }
        }
        return result;
    }
}
