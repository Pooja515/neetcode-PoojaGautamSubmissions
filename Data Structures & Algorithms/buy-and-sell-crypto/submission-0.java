class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length , maxi =0 , buy = prices[0];
        for(int i= 1;i<n ;i++){
            buy = Math.min(buy , prices[i]);
            maxi = Math.max(maxi , (prices[i] - buy));
        }
        return maxi;
    }
}
