class Solution {
    
    public int uniquePaths(int m, int n) {
       
        int[] dp = new int[n];
    
        for(int i=0; i<m; i++){
           
            for(int j=0 ; j<n; j++){
                if(i ==0 && j ==0){
                    dp[0] =1;
                    continue;
                }
                int up =0 , left =0;
                if(j>0) left =  dp[j-1];
                if(i>0) up = dp[j];
                dp[j] = up + left;
            }
        }
    return dp[n-1];
    }
}
