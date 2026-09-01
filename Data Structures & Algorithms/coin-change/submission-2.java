class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length; 
        int res = f(n-1,amount,coins);

        return res >= (int) 1e9 ? -1: res;
    }

    int f(int i , int amount , int[] coins){

        if(amount == 0) return 0;
        if(i==0){
            if(amount % coins[0] == 0) return amount/coins[0];
            else
                  return (int) 1e9;
        }

        // choices
        int nottake = 0 + f(i-1,amount,coins);
        int take = (int) 1e9;
        if(coins[i] <= amount){
            take = 1 + f(i,amount-coins[i],coins);
        }

        return Math.min(take,nottake);
    }
}
