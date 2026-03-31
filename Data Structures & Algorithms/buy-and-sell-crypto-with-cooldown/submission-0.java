class Solution {
    Map<String, Integer> dp = new HashMap<>();
    public int maxProfit(int[] prices) {
        
        return dfs(prices, 0, true);
    }

    private int dfs(int[] prices, int i, boolean buying){
        if(i>=prices.length){
            return 0;
        }
        String key = i+"-"+buying;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int cooldown = dfs(prices, i+1, buying);
        if(buying){
            int buy = dfs(prices, i+1, false)-prices[i];
            dp.put(key, Math.max(buy, cooldown));
        }
        else{
            int sell = dfs(prices, i+2, true)+prices[i];
            dp.put(key, Math.max(sell, cooldown));
        }
        return dp.get(key);
    }
}
