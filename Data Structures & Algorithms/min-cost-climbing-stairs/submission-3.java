class Solution {
   
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n <= 1) return cost[n];

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;

        for(int i =2 ;i <= n ;i++){
            int choice1 = dp[i-1] + cost[i-1];
            int choice2 = dp[i-2 ] + cost[i-2];

             dp[i] = Math.min(choice1 , choice2);
        }
 return dp[n];
         
    }
}
