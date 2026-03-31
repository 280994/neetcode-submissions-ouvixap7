class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE, maxProfit=0;
        for(int i:prices){
            if(i<minPrice){
                minPrice=i;
            }
            if(maxProfit<i-minPrice){
                maxProfit=i-minPrice;
            }
        }
        return maxProfit;
    }
}
