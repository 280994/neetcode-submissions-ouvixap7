class Solution {
    public int maxProfit(int[] prices) {
        int j=Integer.MAX_VALUE, result=0;
        for(int price:prices){
            if(price<j){
                j=price;
            }
            else{
                result=Math.max(result,price-j);
            }
        }
        return result;
    }
}
