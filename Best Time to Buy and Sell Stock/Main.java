// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
              
            }
            else{
                 profit = prices[i]-minPrice;
            }

            maxProfit = Math.max(maxProfit,profit);
        }   
        return maxProfit;
    }
}