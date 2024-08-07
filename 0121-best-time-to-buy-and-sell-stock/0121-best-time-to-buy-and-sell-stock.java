class Solution {
    public int maxProfit(int[] prices) {
        //at the beginning the first value would be taken
        int buy_price = prices[0];

        int profit = 0;

        for(int i = 0;i < prices.length;i++){
            //if current price is less then update the price
            if(prices[i] < buy_price ){
                buy_price = prices[i];
            }else{
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit,profit);
            }
        }
        return profit;
    }
}