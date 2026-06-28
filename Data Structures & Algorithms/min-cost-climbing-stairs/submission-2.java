class Solution {
    int[] memo;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n <= 1) return cost[n];

        memo = new int[n+1];
        Arrays.fill(memo , -1);

        return f(n , cost);
    }
    int f(int n , int[] cost){

         if(n <= 1) return 0;

         if(memo[n] != -1) return memo[n];

         int choice1 = f(n-1 , cost) + cost[n-1];
         int choice2 = f(n-2 , cost) + cost[n-2];

         return memo[n] = Math.min(choice1 , choice2);
    }
}
