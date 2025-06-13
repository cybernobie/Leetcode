class Solution {
    public int maxProfit(int[] prices) {
        int x=0;
        int profit=0;
        int min = prices[0];

        for(int i=0;i<prices.length;i++)
        {
            min = Math.min(min,prices[i]);

            int todayPrice = prices[i]-min;
            profit = Math.max(todayPrice,profit); 
           
        }
        return profit;
    }
}