class Solution {
    int[][] memo;
    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n)
            return 0;
        memo= new int[m][n];
        for(int[] rows: memo){
            Arrays.fill(rows,-1);
        }

        return f(m - 1, n - 1, s, t);
    }
    int f(int ind1, int ind2, String s, String t) {
        // base case
        if (ind2 < 0)
            return 1;
        if (ind1 < 0)
            return 0;

        if(memo[ind1][ind2] != -1) return memo[ind1][ind2];

        // match
        if (s.charAt(ind1) == t.charAt(ind2)) {
            return memo[ind1][ind2]= f(ind1 - 1, ind2 - 1, s, t) + f(ind1 - 1, ind2, s, t);
        }

        else{
            return memo[ind1][ind2] = f(ind1 - 1, ind2, s, t);
        }
           
    }
}
