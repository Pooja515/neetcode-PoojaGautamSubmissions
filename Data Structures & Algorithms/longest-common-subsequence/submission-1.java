class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length() , m = text2.length();

        int[][] memo = new int[n][m];
        for(int[] row : memo){
            Arrays.fill(row , -1);
        }

        return f(n-1 , m-1 , text1 , text2 ,memo);
    }
    int f(int i , int j , String s1 , String s2 , int[][] memo){
        if(i<0 || j<0 ) 
            return 0;
        
        if(memo[i][j] != -1) return memo[i][j];

        if(s1.charAt(i) == s2.charAt(j))
               return memo[i][j] = 1 + f(i-1 , j-1 , s1 , s2 , memo);
        
       
    return memo[i][j] = 0 + Math.max(f(i-1 , j , s1 , s2 , memo) , f(i , j-1 , s1 , s2 , memo));
    }
}
