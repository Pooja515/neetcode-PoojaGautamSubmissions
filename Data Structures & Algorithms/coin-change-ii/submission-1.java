class Solution {
    int[][] memo;
    public int change(int amount, int[] coins) {
        int n = coins.length;
        memo = new int[n][amount+1];
        for(int[] r: memo){
            Arrays.fill(r,-1);   
        }
        return f(n-1, amount, coins);
    }
    int f(int ind, int amount, int[] coins) {
        if (amount == 0)
            return 1;
        if (ind == 0) {
           
                if (amount % coins[0] == 0) {
                    return 1;
                } else
                      return 0;
            }
        
        if(memo[ind][amount] != -1){
            return memo[ind][amount];
        }
        int pick = 0;
        if (coins[ind] <= amount) {
            pick = f(ind, amount - coins[ind], coins);
        }
        int unpick = f(ind - 1, amount, coins);
        return memo[ind][amount] = unpick + pick;
    }
}
