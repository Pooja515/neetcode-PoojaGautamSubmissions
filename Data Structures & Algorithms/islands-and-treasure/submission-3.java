class Solution {
    public void islandsAndTreasure(int[][] grid) {
         
        int m = grid.length, n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0) {
                    q.offer(new int[] { r, c });
                } 
            }
        }

        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dir) {
                int newr = cur[0] + d[0];
                int newc = cur[1] + d[1];
                if (newr >= 0 && newr < m && newc >= 0 && newc < n && grid[newr][newc] == Integer.MAX_VALUE) {
                    grid[newr][newc] = grid[cur[0]][cur[1]] + 1;
                    q.offer(new int[] { newr, newc });
                }
            }

        }
    }
}


