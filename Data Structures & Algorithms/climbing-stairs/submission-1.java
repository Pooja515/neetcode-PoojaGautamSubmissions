class Solution {
    public int climbStairs(int n) {
        if(n <= 1) return 1;
     
         int[] memo = new int[n+1];
         Arrays.fill(memo , -1);

        return climb(n , memo);
    }
    int climb(int n , int[] memo){
        if(n <= 1) return 1;

        if(memo[n] != -1) return memo[n];
        
        return memo[n] = climb(n-1,memo) + climb(n-2,memo);
    }
}