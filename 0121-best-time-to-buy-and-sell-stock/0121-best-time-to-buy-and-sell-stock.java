class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy_prices = prices[0];
        for(int i = 0;i < prices.length;i++){
            if(prices[i] < buy_prices){
               buy_prices = prices[i];
            }
            else{
                int curr_profit = prices[i] - buy_prices;
                profit = Math.max(curr_profit,profit);
            }
        }
        return profit;
    }
}