class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        // transpose
        for (int r = 0; r < m; r++) {
            for (int c = r+1; c < n; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        // reverse each row
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n/2; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][n-1-c];
                matrix[r][n-1-c] = temp;
            }
        }
    }
}
