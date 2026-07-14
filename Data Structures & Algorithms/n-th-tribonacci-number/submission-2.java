class Solution {
    int[] memo;
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return f(n);
    }
    int f(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        if (memo[n] != -1)
            return memo[n];
        return memo[n] = f(n - 1) + f(n - 2) + f(n - 3);
    }
}