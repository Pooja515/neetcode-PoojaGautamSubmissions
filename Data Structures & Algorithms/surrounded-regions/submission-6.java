class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0)
            return;
        int m = board.length, n = board[0].length;

        // MARK COLUMN
        for (int r = 0; r < m; r++) {
            if (board[r][0] == 'O') {
                isValid(r, 0, board);
            }
            if (board[r][n - 1] == 'O') {
                isValid(r, n - 1, board);
            }
        }
        // MARK ROWS
        for (int c = 0; c < n; c++) {
            if (board[0][c] == 'O') {
                isValid(0, c, board);
            }
            if (board[m - 1][c] == 'O') {
                isValid(m - 1, c, board);
            }
        }

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else {
                    if (board[r][c] == 'S') {
                        board[r][c] = 'O';
                    }
                }
            }
        }
    }
    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    void isValid(int r, int c, char[][] board) {
        board[r][c] = 'S';
        for (int[] d : dir) {
            int newr = r + d[0], newc = c + d[1];
            if (newr >= 0 && newr < board.length && newc >= 0 && newc < board[0].length
                && board[newr][newc] == 'O') {
                isValid(newr, newc, board);
            }
        }
    }
}
