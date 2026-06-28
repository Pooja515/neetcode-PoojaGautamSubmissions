class Solution {
   
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n <= 1) return cost[n];
        int prev2 = 0 , prev1 = 0;

        for(int i =2 ;i <= n ;i++){
            int choice1 = prev1 + cost[i-1];
            int choice2 = prev2 + cost[i-2];

             int cur = Math.min(choice1 , choice2);
             prev2 = prev1;
             prev1 = cur;
        }
     return prev1;
         
    }
}
