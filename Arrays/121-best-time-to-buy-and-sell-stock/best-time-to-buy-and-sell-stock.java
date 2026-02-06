class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int profit = 0;
        for (int i=1 ; i<prices.length; i++) {
            int diff = prices[i] - prices[min];
            //profit = Math.min(profit, prices[i] - prices[min]);
            if (prices[i] < prices[min]) {
                min = i;
            }
            if (diff > profit) {
                profit = diff;
            }
        }
        return profit;
    }
}