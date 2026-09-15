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
       for(int i=0;i<n;i++){
            int low =0,high=n-1;
            while(low<high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] =temp;
                low++;
                high--;
            }
        }
    }
}
